package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.BH;
import tn.esprit.spring.entity.Bank;
import tn.esprit.spring.entity.Loan;
import tn.esprit.spring.entity.STB;
import tn.esprit.spring.entity.Taux;
import tn.esprit.spring.repository.BankRepository;
import tn.esprit.spring.repository.LoanRepository;

@Service
public class Loan_Service_Impl implements Loan_Service {
	@Autowired
	LoanRepository loanrep;
	@Autowired
	BankRepository bankRepo;
	@Override
	public Loan addLoan(Loan l) {
		//Bank bank=bankRepo.getBankByidBank(idBank);
		//System.out.println(bank);
		//if (bank instanceof STB ) {
		l.setTotalInterets(this.calculTotalInterets(l));
		l.setCommision(this.calculCommision(l));
		l.setTVA(this.calculTva(l)); 
		l.setFrais(this.calculFraisValidation(l)); 
		l.setAssurance(this.calculAssurance(l));
		l.setTotalPayment(l.getLoanVlaue()+l.getAssurance()+l.getCommision()
			+l.getFrais()+l.getTotalInterets()+l.getTVA());
		l.setTotalPayementParMois(l.getTotalPayment()/l.getDuree());
		
		
		return loanrep.save(l);
			
		
		

		
	}

	@Override
	public void updateLoan(Loan Loan) {
		loanrep.save(Loan);

	}

	@Override
	public void deleteLoan(Loan Loan) {
		loanrep.delete(Loan);
	}

	@Override
	public Loan retrieveLoantById(Long idLoan) {
		loanrep.findById(idLoan).get();
		return null;
	}

	@Override
	public double calculTotalInterets(Loan loan) {
			double interet=loan.getLoanVlaue()*Taux.INTERET;
			double itr=(double) Math.round(interet*100)/100;
		return itr;
	}

	@Override
	public double calculCommision(Loan loan) {
		double interet=loan.getLoanVlaue()*Taux.COMMISSION;
		double itr=(double) Math.round(interet*100)/100;
		return itr;
	}

	@Override
	public double calculTva(Loan loan) {
		double interet=loan.getLoanVlaue()*Taux.FRAIS_TVA;
		double itr=(double) Math.round(interet*100)/100;		
		return itr;
	}

	@Override
	public double calculFraisValidation(Loan loan) {
		double interet=loan.getLoanVlaue()*Taux.FRAIS_VALIDATION;
		double itr=(double) Math.round(interet*100)/100;
		return itr;
	}

	@Override
	public double calculAssurance(Loan loan) {
		double interet=loan.getLoanVlaue()*Taux.FRAIS_ASSURANCE;
		double itr=(double) Math.round(interet*100)/100;
		return itr;
	}




	

}
