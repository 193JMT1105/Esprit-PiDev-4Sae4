package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Admin;
import tn.esprit.spring.repository.AdminRepository;
@Service
public class Admin_Service implements Admin_Service_Impl {
	@Autowired
	AdminRepository adminRep ;

	@Override
	public void addAdmin(Admin ad) {
		// TODO Auto-generated method stub
		adminRep.save(ad);
	}

	@Override
	public void updateAdmin(Admin ad) {
		// TODO Auto-generated method stub
		adminRep.save(ad);
	}

	@Override
	public Admin retrieveAdminById(Long idAdmin) {
		// TODO Auto-generated method stub
		return adminRep.findById(idAdmin).get();
	}

	@Override
	public List<Admin> retrieveAlladmin() {
		// TODO Auto-generated method stub
		return(List<Admin>) adminRep.findAll();
	}

	@Override
	public void deleteAdmin(Admin ad) {
		// TODO Auto-generated method stub
		adminRep.delete(ad);
		
	}

}
