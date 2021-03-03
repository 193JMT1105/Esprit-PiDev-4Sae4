package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Bank;

public interface BankRepository extends CrudRepository<Bank, Long> {

}
