package tn.esprit.spring.dto;

public class RegisterRequest {
private String email;
private String firstName ;
private String lastName ;
private String Login;
private String password;

public RegisterRequest() {
	super();
	// TODO Auto-generated constructor stub
}

public RegisterRequest(String email, String firstName, String lastName, String login, String password) {
	super();
	this.email = email;
	this.firstName = firstName;
	this.lastName = lastName;
	Login = login;
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getLogin() {
	return Login;
}

public void setLogin(String login) {
	Login = login;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}


}
