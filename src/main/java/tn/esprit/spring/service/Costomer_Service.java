package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Costomer;
import tn.esprit.spring.repository.CostomerRepository;
@Service
public class Costomer_Service implements Costomer_Service_Impl{
	@Autowired
	CostomerRepository costRepo;

	@Override
	public void addCostomer(Costomer c) {
		costRepo.save(c);
		
	}

	@Override
	public void updateCostomer(Costomer c) {
		// TODO Auto-generated method stub
		costRepo.save(c);
		
	}

	@Override
	public Costomer retrieveCostomerById(Long idCostomer) {
		// TODO Auto-generated method stub
		return costRepo.findById(idCostomer).get();
	}

	@Override
	public List<Costomer> retrieveAllCostomers() {
		
		// TODO Auto-generated method stub
		
		return(List<Costomer>) costRepo.findAll();
	}

	@Override
	public void deleteCostomer(Costomer c) {
		// TODO Auto-generated method stub
		costRepo.delete(c);
		
	}

	@Override
	public void deleteCostomerById(Long id) {
		// TODO Auto-generated method stub
		costRepo.deleteById(id);
		
	}

}
