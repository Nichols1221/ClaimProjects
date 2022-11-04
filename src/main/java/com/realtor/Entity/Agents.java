package com.realtor.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="agents")

public class Agents {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@Column(name="email", unique = true)
	String email;
	@Column(name="username")
	String username;
	@Column(name="password")
	String password;
	@Column(name="phonenumber")
	Double phoneNumber;
	
	@OneToMany
	 @JoinColumn(name="agentId", referencedColumnName = "id")
	List<Listings> listings;
	
	public Agents() {
		super();
	}


	
	public Agents(String email, String username, String password, Double phoneNumber) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}


	public Integer getId() {
		return id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}



	public Double getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(Double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
