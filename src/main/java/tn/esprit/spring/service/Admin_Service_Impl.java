package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Admin;
import tn.esprit.spring.entity.Agent;

public interface Admin_Service_Impl {
	void addAdmin(Admin ad);
	void updateAdmin(Admin ad);
	Admin retrieveAdminById(Long idAdmin);
	List <Admin> retrieveAlladmin();
	void deleteAdmin(Admin ad);

}
