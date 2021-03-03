package tn.esprit.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_Costomer")
public class Costomer{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Costomer_id")
	private Long id ;
	@Column(name = "Costomer_login")
	private String loginCostomer ;
	@Column(name = "Costomer_pwd")
	private String pwdCostomer ;
	public Costomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Costomer(Long id, String loginCostomer, String pwdCostomer) {
		super();
		this.id = id;
		this.loginCostomer = loginCostomer;
		this.pwdCostomer = pwdCostomer;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoginCostomer() {
		return loginCostomer;
	}
	public void setLoginCostomer(String loginCostomer) {
		this.loginCostomer = loginCostomer;
	}
	public String getPwdCostomer() {
		return pwdCostomer;
	}
	public void setPwdCostomer(String pwdCostomer) {
		this.pwdCostomer = pwdCostomer;
	}
	

}
