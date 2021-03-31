package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Costomer;
@Repository
public interface CostomerRepository extends CrudRepository<Costomer, Long> {
	Costomer findById(long id);
}
