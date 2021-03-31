package tn.esprit.spring.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Admin;
import tn.esprit.spring.entity.Costomer;
import tn.esprit.spring.service.Admin_Service;


@RestController
@RequestMapping("/Admin")
public class AdminRestController {
	@Autowired
	Admin_Service adminser;
	@PostMapping("/addAdmin")
	public void addCostomer(@RequestBody  Admin a)
	{
		adminser.addAdmin(a);
	}
	@GetMapping("/retrieveAdmins")
	public List<Admin> retrieveAdmin()
	{
		return adminser.retrieveAlladmin();
	}
	
	
	
	
	
	
}
