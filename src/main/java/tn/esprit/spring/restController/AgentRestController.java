package tn.esprit.spring.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.service.Agent_Service;

@RestController
@RequestMapping("/Agent")
public class AgentRestController {
	@Autowired
	Agent_Service agentserv;

}
