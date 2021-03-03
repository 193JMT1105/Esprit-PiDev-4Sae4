package tn.esprit.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_Agent")
public class Agent{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Agent_id")
	private Long id ;
	@Column(name = "Agent_login")
	private String agentLogin;
	@Column(name = "Agent_pwd")
	private String agentpwd;
	
	
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Agent(Long id, String agentLogin, String agentpwd) {
		super();
		this.id = id;
		this.agentLogin = agentLogin;
		this.agentpwd = agentpwd;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAgentLogin() {
		return agentLogin;
	}
	public void setAgentLogin(String agentLogin) {
		this.agentLogin = agentLogin;
	}
	public String getAgentpwd() {
		return agentpwd;
	}
	public void setAgentpwd(String agentpwd) {
		this.agentpwd = agentpwd;
	}
	

}
