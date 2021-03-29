package tn.esprit.spring.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("BH")

@Table(name="BH")

public class BH extends Bank{
	
	

}
