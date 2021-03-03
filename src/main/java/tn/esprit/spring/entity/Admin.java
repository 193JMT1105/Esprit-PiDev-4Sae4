package tn.esprit.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_Admin")
public class Admin{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "Admin_id")
private Long id ;
@Column(name = "Admin_login")
private String loginAdmin ;
@Column(name = "Admin_pwd")
private String pwdAdmin ;
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}
public Admin(Long id, String loginAdmin, String pwdAdmin) {
	super();
	this.id = id;
	this.loginAdmin = loginAdmin;
	this.pwdAdmin = pwdAdmin;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getLoginAdmin() {
	return loginAdmin;
}
public void setLoginAdmin(String loginAdmin) {
	this.loginAdmin = loginAdmin;
}
public String getPwdAdmin() {
	return pwdAdmin;
}
public void setPwdAdmin(String pwdAdmin) {
	this.pwdAdmin = pwdAdmin;
}

}
