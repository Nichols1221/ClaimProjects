package com.realtor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.realtor.Service.PhotoService;

@Controller
public class PhotoController {

	
	@Autowired
	PhotoService photoService;
}
