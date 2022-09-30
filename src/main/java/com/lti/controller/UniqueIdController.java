package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.service.UniqueIdService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UniqueIdController {
	
	@Autowired
	private UniqueIdService uidService;
	
	@GetMapping("/regid")
	public int get() {
		int id =  this.uidService.getRegId();
		this.uidService.updateRegId();
		return id;
	}
	
	@RequestMapping("/addId")
	public void add() {
		this.uidService.addEntry();
	}
}
