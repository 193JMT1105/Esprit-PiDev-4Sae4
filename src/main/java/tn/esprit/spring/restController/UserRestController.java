package tn.esprit.spring.restController;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.User;
import tn.esprit.spring.service.User_Service;

@RestController
@RequestMapping("/user")
public class UserRestController {
	@Autowired
	User_Service usrServ ;

	
	@PostMapping("/adduser")
	public void adduser(@RequestBody  User user)
	{
		usrServ.addUser(user);	
	}
	@GetMapping("/retrieveAllusers")
	public List<User> retrieveAllUsers()
	{
		return usrServ.retrieveAllUsers();
	}
	
	@PutMapping("/updateUser")
	public void updateUser(@RequestBody  User user)
	{
		usrServ.updateUser(user);
	}
	@GetMapping("/retrieveUserById/{id}")
	public void retrieveUserById(@PathParam("id") Long id)
	{
		usrServ.retrieveUserById(id);
	}
   @DeleteMapping("/deleteUser")
   public void deleteUser(@RequestBody User user)
   {
	   usrServ.deleteUser(user);  
   }
}
