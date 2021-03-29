package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Loan implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idLoan;
	private float loanVlaue;
	private double duree;
	private double totalInterets;
    private double commision;
    private double TVA;
    private double frais;
    private double assurance;
    private double TotalPayment;
    private double TotalPayementParMois;
	
	
	@ManyToOne
	@JoinColumn(name="bank")
	private Bank bank;


	public double getTotalPayementParMois() {
		return TotalPayementParMois;
	}


	public void setTotalPayementParMois(double totalPayementParMois) {
		TotalPayementParMois = totalPayementParMois;
	}


	public Long getIdLoan() {
		return idLoan;
	}


	public void setIdLoan(Long idLoan) {
		this.idLoan = idLoan;
	}


	public float getLoanVlaue() {
		return loanVlaue;
	}


	public void setLoanVlaue(float loanVlaue) {
		this.loanVlaue = loanVlaue;
	}


	public double getDuree() {
		return duree;
	}


	public void setDuree(double duree) {
		this.duree = duree;
	}


	public double getTotalInterets() {
		return totalInterets;
	}


	public void setTotalInterets(double totalInterets) {
		this.totalInterets = totalInterets;
	}


	public double getCommision() {
		return commision;
	}


	public void setCommision(double commision) {
		this.commision = commision;
	}


	public double getTVA() {
		return TVA;
	}


	public void setTVA(double tVA) {
		TVA = tVA;
	}


	public double getFrais() {
		return frais;
	}


	public void setFrais(double frais) {
		this.frais = frais;
	}


	public double getAssurance() {
		return assurance;
	}


	public void setAssurance(double assurance) {
		this.assurance = assurance;
	}


	public double getTotalPayment() {
		return TotalPayment;
	}


	public void setTotalPayment(double totalPayment) {
		TotalPayment = totalPayment;
	}


	public Bank getBank() {
		return bank;
	}


	public void setBank(Bank bank) {
		this.bank = bank;
	}
	

}
