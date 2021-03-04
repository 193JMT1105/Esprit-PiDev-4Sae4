package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Bank;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.repository.BankRepository;
@Service
public class Bank_Service implements Bank_Service_Impl {
	@Autowired
	BankRepository bankrep;

	@Override
	public void addBank(Bank ban) {
		// TODO Auto-generated method stub
		bankrep.save(ban);
		
	}

	@Override
	public void updateBank(Bank ban) {
		// TODO Auto-generated method stub
		bankrep.save(ban);
	}

	@Override
	public Bank retrieveBankById(Long idBank) {
		// TODO Auto-generated method stub
		return bankrep.findById(idBank).get();
	}

	@Override
	public List<Bank> retrieveAllBanks() {
		// TODO Auto-generated method stub
		return(List<Bank>) bankrep.findAll();
	}

	@Override
	public void deleteBank(Bank ban) {
		// TODO Auto-generated method stub
		bankrep.delete(ban);
	}

}
