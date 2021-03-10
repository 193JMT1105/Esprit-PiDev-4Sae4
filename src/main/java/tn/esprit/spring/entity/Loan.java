package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Loan implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idLoan;
	private float loanVlaue;
	private float monthlyIncome;
	
	
	@ManyToOne
	@JoinColumn(name="bank")
	private Bank bank;

}
