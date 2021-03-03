package tn.esprit.spring.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.service.User_Service;

@RestController
@RequestMapping("/user")
public class UserRestController {
	@Autowired
	User_Service usrServ ;
	

}
