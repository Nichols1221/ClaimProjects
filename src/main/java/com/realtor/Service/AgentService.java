package com.realtor.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realtor.Entity.Agents;

import com.realtor.Repo.AgentRepo;


@Service
public class AgentService {
	
    
    @Autowired
    AgentRepo agentRepo;
    
	
	
	
	
	
	
	
	public void save(Agents agent) {
		
	agentRepo.save(agent);

	   
	}
    
    public Agents signIn(Agents agent) {
		return agent;
       
            
        
        
        
    }
    
    public Agents getAgentById(Integer agentId) {
		return null;
     
        
        
        
        
       
    }
	

}