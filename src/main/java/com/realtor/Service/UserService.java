package com.realtor.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realtor.Entity.User;
import com.realtor.Repo.UserRepo;

@Service
public class UserService {
	
    
    @Autowired
    UserRepo userRepo;
    
	
	
	
	
	
	
	
	public void save(User user) {
		
	userRepo.save(user);

	   
	}
    
    public User signIn(User user) {
		return user;
       
            
        
        
        
    }
    
    public User getUserById(Integer userId) {
		return null;
     
        
        
        
        
       
    }
	

}