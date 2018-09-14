package com.rmi.start.service;

import com.rmi.start.domain.Agent;
import com.rmi.start.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService {

    @Autowired
    private AgentRepository agentRepository;

    public Agent addAgent(final Agent agent) {
        return agentRepository.save(agent);
    }

    public List<Agent> getAgents() {
        return agentRepository.findAll();
    }




}

