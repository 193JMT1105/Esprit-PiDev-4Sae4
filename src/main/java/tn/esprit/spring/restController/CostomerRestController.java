package tn.esprit.spring.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.service.Costomer_Service;

@RestController
@RequestMapping("/Costomer")
public class CostomerRestController {
	@Autowired
	Costomer_Service costService;

}