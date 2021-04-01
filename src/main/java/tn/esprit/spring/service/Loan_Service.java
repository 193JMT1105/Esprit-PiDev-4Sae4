package tn.esprit.spring.service;


import tn.esprit.spring.entity.Loan;

public interface Loan_Service {
	Loan addLoan(Loan Loan);
	void updateLoan(Loan Loan);
	Loan retrieveLoantById(Long idLoan);
	void deleteLoan(Loan Loan);
	//Loan getLoanById(Long idLoan);
	double calculTotalInterets(Loan loan);
	double calculCommision(Loan loan);
	double calculTva(Loan loan);
	double calculFraisValidation(Loan loan);
	double calculAssurance(Loan loan);
	
	





}
