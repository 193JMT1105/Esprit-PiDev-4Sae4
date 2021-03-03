package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.User;

public interface User_Service_Impl {
	void addUser(User u);
	void updateUser(User u);
	User retrieveUserById(Long idUser);
	List <User> retrieveAllUsers();
	void deleteUser(User u);
	

}
