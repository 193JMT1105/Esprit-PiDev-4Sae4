package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Bank;
import tn.esprit.spring.entity.Loan;
@Repository
public interface BankRepository extends CrudRepository<Bank, Long> {
	
	public Bank getBankByidBank(Long idBank);
	
	

}
