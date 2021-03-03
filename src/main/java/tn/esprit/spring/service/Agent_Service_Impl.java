package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Agent;

public interface Agent_Service_Impl {
	void addAgent(Agent a);
	void updateAgent(Agent a);
	Agent retrieveAgentById(Long idAgent);
	List <Agent> retrieveAllAgents();
	void deleteAgent(Agent a);
}
