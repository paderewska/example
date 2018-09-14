package com.rmi.start.mapper;

import com.rmi.start.domain.Agent;
import com.rmi.start.domain.AgentDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AgentMapper {

    public Agent mapToAgent(final AgentDto agentDto) {
        return new Agent(
                agentDto.getId(),
                agentDto.getName(),
                agentDto.getPhoneNumber(),
                agentDto.getAge());
    }


    public AgentDto mapToAgentDto(final Agent agent) {
        return new AgentDto(
                agent.getId(),
                agent.getName(),
                agent.getPhoneNumber(),
                agent.getAge());
    }

    public List<AgentDto> mapToAgentDtoList (final List<Agent> agentList) {
        List<AgentDto> list = new ArrayList<>();
        for(Agent agent : agentList) {
            AgentDto agentDto = new AgentDto(agent.getId(), agent.getName(), agent.getPhoneNumber(), agent.getAge());
        list.add(agentDto);
        }
        return list;
    }

}
