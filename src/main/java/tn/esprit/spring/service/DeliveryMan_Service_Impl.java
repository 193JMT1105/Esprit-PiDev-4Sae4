package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.DeliveryMan;

public interface DeliveryMan_Service_Impl {
	void addDeliveryMan(DeliveryMan deliv);
	void updateDeliveryMan(DeliveryMan deliv);
	DeliveryMan retrieveDeliveryManById(Long iddeli);
	List <DeliveryMan> retrieveAllDeliveryMan();
	void deleteDeliveryMan(DeliveryMan deliv);
}
