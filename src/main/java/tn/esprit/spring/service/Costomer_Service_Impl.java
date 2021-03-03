package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Costomer;

public interface Costomer_Service_Impl {
	void addCostomer(Costomer c);
	void updateCostomer(Costomer c);
	Costomer retrieveCostomerById(Long idCostomer);
	List <Costomer> retrieveAllCostomers();
	void deleteCostomer(Costomer c);
	
}
