package tn.esprit.spring.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dto.RegisterRequest;
import tn.esprit.spring.entity.NotificationEmail;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.entity.VerificationToken;
import tn.esprit.spring.repository.UserRepository;
import tn.esprit.spring.repository.VerificationTokenRepository;

@Service
public class AuthService {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	UserRepository userRepo;
	@Autowired
	VerificationTokenRepository verivicationTokenRepo;
	@Autowired
	MailService mailService ;
	@Transactional
public void signup(RegisterRequest registerRequest) {
	User user = new User();
	user.setFirstName(registerRequest.getFirstName());
	user.setLastName(registerRequest.getLastName());
	user.setLogin(registerRequest.getLogin());
	user.setEmail(registerRequest.getEmail());
	user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
	userRepo.save(user);
	String token =generateVerificationToken(user);
//	mailService.sendMail(new NotificationEmail("Please Activate your Account",
//            user.getEmail(), "Thank you for signing up to Spring Reddit, " +
//            "please click on the below url to activate your account : " +
//            "http://localhost:8082/api/auth/accountVerification/" + token));
}
	private String generateVerificationToken(User user) {
		// TODO Auto-generated method stub
		String token = UUID.randomUUID().toString();
		VerificationToken verificationToken = new VerificationToken();
		verificationToken.setToken(token);
		verificationToken.setUser(user);
		verivicationTokenRepo.save(verificationToken);
		return token ;
		
	}
}
