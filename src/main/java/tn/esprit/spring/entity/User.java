package tn.esprit.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_id")
	private Long id ;
	@Column(name = "User_First_Name")
	private String firstName ;
	@Column(name = "User_Last_Name")
	private String lastName ;
	@Column(name = "User_Email")
	private String email;
	@Column(name = "Login")
	private String login;
	@Column(name = "Password")
	private String password;
	
	
	
	

}
