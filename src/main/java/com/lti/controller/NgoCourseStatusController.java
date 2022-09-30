package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.NgoCourseStatus;
import com.lti.exception.NoSuchRegistrationException;
import com.lti.service.NgoCourseStatusService;
import com.lti.service.UniqueIdService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class NgoCourseStatusController {
	@Autowired
	private NgoCourseStatusService statusService;
	
	@Autowired
	private UniqueIdService id;
	
	@PostMapping("/ngo-status")
	public NgoCourseStatus add(@RequestBody() NgoCourseStatus status) {
		status.setStatus("Under processing");
		status.setRegId(id.getRegId());
		id.updateRegId();
		return this.statusService.updateCourseStatus(status);
	}
	
	@GetMapping("/ngo-status/{id}")
	public NgoCourseStatus get(@PathVariable("id") int id) {
		NgoCourseStatus ngo;
		try {
			ngo = this.statusService.getStatus(id);
		}catch(NoSuchRegistrationException e) {
			ngo = new NgoCourseStatus();
		}
		return ngo;
	}
	
	@GetMapping("/pending-ngos")
	public List<NgoCourseStatus> getAll(){
		return this.statusService.getAll();
	}
	
	@PutMapping("/ngo-status")
	public void updateStatus(@RequestBody() NgoCourseStatus status) {
		this.statusService.updateCourseStatus(status);
	}
}
