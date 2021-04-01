package tn.esprit.spring.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import javax.persistence.Table;


@Entity
@DiscriminatorValue("STB")
@Table(name="STB")

public class STB extends Bank {

	public STB() {
		super();
		// TODO Auto-generated constructor stub
	}

	public STB(Long idBank, String nameBank) {
		super(idBank, nameBank);
		// TODO Auto-generated constructor stub
	}
	
	
	

}
