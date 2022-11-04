package com.realtor.Controller;

import org.aspectj.weaver.loadtime.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import com.realtor.Entity.Listings;

import com.realtor.Service.ListingService;

@Controller
public class ListingController {
	
	@Autowired
	ListingService listingService;
	
	
	
	@GetMapping("/newListing")
	public String newListing(Model model) {

		model.addAttribute("listings", new Listings());
		return "nListing";

	}

	@PostMapping("/newListing")
	public ModelAndView agentSignUp(@ModelAttribute Listings listing, Model model) {

		listingService.save(listing);

		return new ModelAndView("agentportal", "listing", new Listings());
		
	}
	
}
