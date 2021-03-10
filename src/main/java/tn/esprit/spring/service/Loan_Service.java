package tn.esprit.spring.service;


import tn.esprit.spring.entity.Loan;

public interface Loan_Service {
	void addLoan(Loan Loan);
	void updateLoan(Loan Loan);
	//Loan retrieveLoantById(Long idLoan);
	void deleteLoan(Loan Loan);

}
