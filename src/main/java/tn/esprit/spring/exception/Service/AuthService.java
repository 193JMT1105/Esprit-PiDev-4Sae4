package tn.esprit.spring.Service;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.AllArgsConstructor;
import tn.esprit.spring.Model.NotificationEmail;
import tn.esprit.spring.Model.User;
import tn.esprit.spring.Model.VerificationToken;
import tn.esprit.spring.Repositories.UserRepository;
import tn.esprit.spring.Repositories.VerificationTokenRepository;
import tn.esprit.spring.Security.JwtHelper;
import tn.esprit.spring.dto.AuthentificationResponse;
import tn.esprit.spring.dto.LoginRequest;
import tn.esprit.spring.dto.RegisterRequest;
import tn.esprit.spring.exception.SpringRedditException;


@Service
@AllArgsConstructor
public class AuthService {

	@Autowired
	 PasswordEncoder passwordEncoder;
	@Autowired
	 UserRepository userRepository ;
	@Autowired
	 VerificationTokenRepository verificationTokenRepository ;
	@Autowired
	  MailService mailService;
	@Autowired
	 AuthenticationManager authenticationManager;
	@Autowired
	 RefreshTokenService refreshTokenService;
    @Autowired
    private final JwtHelper jwtHelper;

    @Transactional
	public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        user.setCreated(Instant.now());
        user.setEnabled(false);
        userRepository.save(user);

       String token = generateVerificationToken(user);
        
       mailService.sendMail(new NotificationEmail("Please Activate your Account",
               user.getEmail(), "Thank you for signing up to Spring Reddit, " +
               "please click on the below url to activate your account : " +
               "http://localhost:8086/api/auth/accountVerification/" + token));
}
	private String generateVerificationToken(User user){
		String token = UUID.randomUUID().toString();
		VerificationToken verificationToken = new VerificationToken();
        verificationToken.setToken(token);
        verificationToken.setUser(user);
		
        verificationTokenRepository.save(verificationToken);
return token ;
	}
	
	public AuthentificationResponse login(LoginRequest loginRequest) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(),
                loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authenticate);
        Map<String, String> claims = new HashMap<>();
        claims.put("user", loginRequest.getUsername());

        String token = jwtHelper.createJwtForClaims(loginRequest.getUsername(), claims);
        return AuthentificationResponse.builder()
                .authenticationToken(token)
                .refreshToken(refreshTokenService.generateRefreshToken().getToken())
                .username(loginRequest.getUsername())
                .build();
    }
	
	@Transactional
    void fetchUserAndEnable(VerificationToken verificationToken) {
        String username = verificationToken.getUser().getUsername();
        User user = userRepository.findByUsername(username).orElseThrow(() -> new SpringRedditException("User not found with name - " + username));
        user.setEnabled(true);
        userRepository.save(user);
    }
	
	public void verifyAccount(String token) {
        Optional<VerificationToken> verificationToken = verificationTokenRepository.findByToken(token);
        fetchUserAndEnable(verificationToken.orElseThrow(() -> new SpringRedditException("Invalid Token")));
    }
}
