package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.NgoFullData;
import com.lti.service.NgoFullDataService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class NgoFullDataController {
	@Autowired
	private NgoFullDataService dataService;
	
	@GetMapping("/ngo-full-data/{username}")
	public NgoFullData get(@PathVariable("username") String username) {
		NgoFullData data;
		
		try {
		    data = this.dataService.getFullData(username);
		}catch(Exception e) {
			data = new NgoFullData();
		}
		
		return data;
	}
	
	@PostMapping("/ngo-data")
	public void addData(@RequestBody() NgoFullData fulldata) {
		this.dataService.addNgoData(fulldata);
	}
}
