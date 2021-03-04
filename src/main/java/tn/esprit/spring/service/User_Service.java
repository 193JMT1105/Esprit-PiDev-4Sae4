package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.User;
import tn.esprit.spring.repository.UserRepository;
@Service
public class User_Service implements User_Service_Impl{
	@Autowired
	UserRepository userRepo;

	@Override
	public void addUser(User u) {
		// TODO Auto-generated method stub
		userRepo.save(u);
		
	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		userRepo.save(u);
	}

	@Override
	public User retrieveUserById(Long idUser) {
		// TODO Auto-generated method stub
		
		return userRepo.findById(idUser).get();
	}

	@Override
	public List<User> retrieveAllUsers() {
		// TODO Auto-generated method stub
		return (List<User>)userRepo.findAll();
	}

	@Override
	public void deleteUser(User u) {
		// TODO Auto-generated method stub
		userRepo.delete(u);
		
	}

}
