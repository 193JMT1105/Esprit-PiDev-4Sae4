package tn.esprit.spring.service;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Loan;
import tn.esprit.spring.repository.LoanRepository;

@Service
public class Loan_Service_Impl implements Loan_Service {
	LoanRepository loanrep;

	@Override
	public void addLoan(Loan Loan) {
		loanrep.save(Loan);
	}

	@Override
	public void updateLoan(Loan Loan) {
		loanrep.save(Loan);

	}

	@Override
	public void deleteLoan(Loan Loan) {
		loanrep.delete(Loan);
	}


	

}
