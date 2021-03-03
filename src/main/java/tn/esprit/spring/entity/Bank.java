package tn.esprit.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_Bank")
public class Bank {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "Bank_id")
private Long idBank ;
@Column(name = "Bank_Name")
private String nameBank ;
public Bank() {
	super();
	// TODO Auto-generated constructor stub
}
public Bank(Long idBank, String nameBank) {
	super();
	this.idBank = idBank;
	this.nameBank = nameBank;
}
public Long getIdBank() {
	return idBank;
}
public void setIdBank(Long idBank) {
	this.idBank = idBank;
}
public String getNameBank() {
	return nameBank;
}
public void setNameBank(String nameBank) {
	this.nameBank = nameBank;
}

}
