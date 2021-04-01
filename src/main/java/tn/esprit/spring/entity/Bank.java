package tn.esprit.spring.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length = 3)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include = JsonTypeInfo.As.PROPERTY,property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(name = "STB",value = STB.class),
        @JsonSubTypes.Type(name = "BH",value = BH.class)
})


public class Bank {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idBank ;
@Column(name = "Bank_Name")
private String nameBank ;

@OneToMany (mappedBy="bank")
private Collection<Agent> agent;


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
