package com.backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.backend.model.OfficeLocation;
import com.backend.repository.OfficeLocationRepository;

@RestController
public class OfficeLocationController {
	@Autowired
	private OfficeLocationRepository officeLocationRepository;
	
	@GetMapping("/officelocations")
	@ResponseBody
	public Iterable<OfficeLocation> getOfficeLocations(){
		try {
			return officeLocationRepository.findAll();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return null;
	}
	
}
