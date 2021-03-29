package tn.esprit.spring.restController;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Bank;
import tn.esprit.spring.entity.Loan;
import tn.esprit.spring.service.Bank_Service;
import tn.esprit.spring.service.Loan_Service;


@RestController

public class LoanRestController {
	
	
	@Autowired
	Loan_Service loanserv;

	@RequestMapping(value = "/addloan", method= RequestMethod.POST, consumes = "application/json" )
	public Loan addLoan(@RequestBody  Loan l)
	{
		return loanserv.addLoan(l);	
	}
	
	@PutMapping("/updateLoan")
	public void updateLoan(@RequestBody  Loan l)
	{
		loanserv.updateLoan(l);
	}
	
	@DeleteMapping("/deleteLoan")
	public void deleteLoan(@RequestBody Loan l)
	{
		loanserv.deleteLoan(l);  
	}
	

	
	
}
