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
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import tn.esprit.spring.entity.Bank;
import tn.esprit.spring.service.Bank_Service;

@RestController
public class BankRestConntroller {
@Autowired
Bank_Service bankser;

@RequestMapping(value= "/addbank", method = RequestMethod.POST, consumes = "application/json")
public void addBank(@RequestBody  Bank b)
{
	bankser.addBank(b);	
}
@GetMapping("/retrieveAllBanks")
public List<Bank> retrieveAllBanks()
{
	return bankser.retrieveAllBanks();
}

@PutMapping("/updateBank")
public void updateBank(@RequestBody  Bank b)
{
	bankser.updateBank(b);
}
@GetMapping("/retrieveBankById/{id}")
public void retrieveBankById(@PathParam("id") Long id)
{
	bankser.retrieveBankById(id);
}
@DeleteMapping("/deleteBank")
public void deleteBank(@RequestBody Bank b)
{
	bankser.deleteBank(b);  
}

}
