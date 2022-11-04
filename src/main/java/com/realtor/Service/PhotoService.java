package com.realtor.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realtor.Entity.Listings;
import com.realtor.Entity.Photos;
import com.realtor.Repo.PhotoRepo;

@Service
public class PhotoService {
	
	@Autowired
	PhotoRepo photorepo;
	
	@Autowired
	ListingService listingService;
	
	public Photos save(Integer listingId, Photos photos) {
		
		Photos savedPhotos = photorepo.save(photos);
		
		Listings listing = listingService.getListingById(listingId);
		
		listing.getPhotos().add(savedPhotos);
		
		listingService.save(listing);
		
		return savedPhotos;
		
	}

}
