package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Admin;
import tn.esprit.spring.entity.DeliveryMan;
import tn.esprit.spring.repository.DeleveryManRepository;
@Service
public class DeliveryMan_Service implements DeliveryMan_Service_Impl {

	@Autowired
	DeleveryManRepository delrep;
	@Override
	public void addDeliveryMan(DeliveryMan deliv) {
			delrep.save(deliv);		
	}

	@Override
	public void updateDeliveryMan(DeliveryMan deliv) {
		delrep.save(deliv);	
		
	}

	@Override
	public DeliveryMan retrieveDeliveryManById(Long iddeli) {
		return  delrep.findById(iddeli).get();
	}

	@Override
	public List<DeliveryMan> retrieveAllDeliveryMan() {
		return (List<DeliveryMan>) delrep.findAll();
	}

	@Override
	public void deleteDeliveryMan(DeliveryMan deliv) {
		delrep.delete(deliv);		
	}
	public void deleteDeleveryManById(Long id) {
		delrep.deleteById(id);
	}

}
