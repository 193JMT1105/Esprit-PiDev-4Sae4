package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entity.Agent;
import tn.esprit.spring.repository.AgentRepository;

public class Agent_Service implements Agent_Service_Impl {
	@Autowired
	AgentRepository agentRepo;

	@Override
	public void addAgent(Agent a) {
		// TODO Auto-generated method stub
		agentRepo.save(a);
		
	}

	@Override
	public void updateAgent(Agent a) {
		// TODO Auto-generated method stub
		agentRepo.save(a);
		
	}

	@Override
	public Agent retrieveAgentById(Long idAgent) {
		// TODO Auto-generated method stub
		return agentRepo.findById(idAgent).get();
	}

	@Override
	public List<Agent> retrieveAllAgents() {
		// TODO Auto-generated method stub
		return(List<Agent>) agentRepo.findAll();
	}

	@Override
	public void deleteAgent(Agent a) {
		// TODO Auto-generated method stub
		agentRepo.delete(a);
		
	}

}
