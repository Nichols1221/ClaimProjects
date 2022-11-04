package com.realtor.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.realtor.Entity.Agents;


@Repository         // Between the <,> first put the type of object, next the type of the primary key
public interface AgentRepo extends JpaRepository<Agents, Integer>{

}
