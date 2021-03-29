package tn.esprit.spring.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import javax.persistence.Table;


@Entity
@DiscriminatorValue("STB")
@Table(name="STB")

public class STB extends Bank {
	
	

}
