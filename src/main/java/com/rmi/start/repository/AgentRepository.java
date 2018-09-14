package com.rmi.start.repository;

import com.rmi.start.domain.Agent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface AgentRepository extends CrudRepository<Agent, Long> {

    @Override
    Agent save(Agent agent);

    @Override
    List<Agent> findAll();

    @Override
    void deleteById(Long id);

}
