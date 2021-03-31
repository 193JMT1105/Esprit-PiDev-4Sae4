package tn.esprit.spring.restController;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Costomer;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.repository.CostomerRepository;
import tn.esprit.spring.service.Costomer_Service;

@RestController
@RequestMapping("/Costomer")
public class CostomerRestController {
	@Autowired
	Costomer_Service costService;
	
	
	@GetMapping("/retrieveAllcostomers")
	public List<Costomer> retrieveAllCostumers()
	{
		return costService.retrieveAllCostomers();
	}
	
	@PostMapping("/addcostomer")
	public void addCostomer(@RequestBody  Costomer c)
	{
		costService.addCostomer(c);
	}
	@GetMapping("/retrievecost/{id}")
	public Costomer retrievecostById(@PathVariable Long id)
	{
		return costService.retrieveCostomerById(id);
	}
	 @DeleteMapping("/delCostById/{id}")
	   public void deleyeCostomerById(@PathVariable Long id)
	   {
		 costService.deleteCostomerById(id);
	   }
	
//	@PutMapping("/updatecostomer/{id}")
//	public void updateCostomer(@RequestBody  Costomer c)
//	{

//	}
}