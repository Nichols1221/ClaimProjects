	package com.realtor.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="photos")
	public class Photos {
	
	 
	
	@Id
	    @Column(name = "id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		Integer id;
	    
	    @Column(name = "imageaddress")
		String imageaddress;

}
