package tn.esprit.spring.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.entity.DeliveryMan;
import tn.esprit.spring.service.DeliveryMan_Service;

@RestController
@RequestMapping("/DeliveryMan")
public class DeliveryManRestController {
	@Autowired
	DeliveryMan_Service delserv;
	@GetMapping("/retrieveAllDeliveryMan")
	public List<DeliveryMan> retrieveAllUsers()
	{
		return delserv.retrieveAllDeliveryMan();
	}
	
	@PostMapping("/addDeliveryMan")
	public void addCostomer(@RequestBody  DeliveryMan deliv)
	{
		delserv.addDeliveryMan(deliv);
	}
	@DeleteMapping("/removeDeliveryMan/{id}")
	public void deleteDelivMan(@PathVariable long id) {
		delserv.deleteDeleveryManById(id);
	}
}
