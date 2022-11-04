package com.realtor.Entity;

import java.util.Date;
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
@Table(name="listings")

public class Listings {
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@Column(name="city")
	String city;
	
	@Column(name="state")
	String state;
	
	@Column(name="price")
	Double price;
	
	@Column(name="date")
	Date date;
	
	@Column(name="squareFeet")
	Integer squareFeet;
	
	
	
	@OneToMany
    @JoinColumn(name="listingId", referencedColumnName = "id")
	List<Photos> photos;
	
	
	public Listings() {
		super();
	}

	public Listings(String city, String state, Double price, Date date, Integer squareFeet) {
		super();
		this.city = city;
		this.state = state;
		this.price = price;
		this.date = date;
		this.squareFeet = squareFeet;
	}

	public Integer getId() {
		return id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getSquareFeet() {
		return squareFeet;
	}

	public void setSquareFeet(Integer squareFeet) {
		this.squareFeet = squareFeet;
	}
	

	public List<Photos> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photos> photos) {
		this.photos = photos;
	}


	
}
