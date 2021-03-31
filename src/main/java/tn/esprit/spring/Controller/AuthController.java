package tn.esprit.spring.Controller;

import static org.springframework.http.HttpStatus.OK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Service.AuthService;
import tn.esprit.spring.dto.AuthentificationResponse;
import tn.esprit.spring.dto.LoginRequest;
import tn.esprit.spring.dto.RegisterRequest;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
    private AuthService authService;

    
	@PostMapping("/signup")
    public ResponseEntity<String>  signup(@RequestBody RegisterRequest registerRequest){
		authService.signup(registerRequest);
		return new ResponseEntity<>("User Registration Successful",
                OK);
	}
	
	@GetMapping("accountVerification/{token}")
    public ResponseEntity<String> verifyAccount(@PathVariable String token) {
        authService.verifyAccount(token);
        return new ResponseEntity<>("Account Activated Successfully", OK);
    }
	
	@PostMapping("/login")
    public AuthentificationResponse login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }
}
