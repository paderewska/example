package com.rmi.start.controller;

import com.rmi.start.domain.AgentDto;
import com.rmi.start.mapper.AgentMapper;
import com.rmi.start.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class AgentController {

    @Autowired
    private AgentService agentService;

    @Autowired
    private AgentMapper agentMapper;

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public AgentDto addAgent(@RequestBody AgentDto agentDto) {
        return agentMapper.mapToAgentDto(agentService.addAgent(agentMapper.mapToAgent(agentDto)));
    }

    @RequestMapping(method = RequestMethod.GET, value = "/get")
    public List<AgentDto> getAgents() {
        return agentMapper.mapToAgentDtoList(agentService.getAgents());
    }


}
