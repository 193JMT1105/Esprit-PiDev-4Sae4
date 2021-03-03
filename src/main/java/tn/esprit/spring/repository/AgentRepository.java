package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Agent;
@Repository
public interface AgentRepository extends CrudRepository<Agent, Long> {

}
