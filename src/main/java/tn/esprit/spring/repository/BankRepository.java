package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Bank;
@Repository
public interface BankRepository extends CrudRepository<Bank, Long> {

}
