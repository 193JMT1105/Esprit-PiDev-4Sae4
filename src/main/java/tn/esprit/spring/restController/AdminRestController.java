package tn.esprit.spring.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.service.Admin_Service;

@RestController
@RequestMapping("/Admin")
public class AdminRestController {
	@Autowired
	Admin_Service adminServ;

}
