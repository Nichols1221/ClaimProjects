package com.realtor.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realtor.Entity.Listings;
import com.realtor.Repo.ListingRepo;

@Service
public class ListingService {

	@Autowired
	ListingRepo listingRepo;
	
	
	public void save(Listings listing) {
	
		listingRepo.save(listing);
	}
	
	public Listings getListingById(Integer listingId) {
		return null;
		
	}
	public Listings getListingByCity(String city) {
		return null;
	}
	public Listings getListingByState(String state) {
		return null;
	}
}
