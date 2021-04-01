package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Appointment;
import tn.esprit.spring.entity.Loan;

@Repository
public interface LoanRepository extends CrudRepository<Loan, Long> {
	
	

}
