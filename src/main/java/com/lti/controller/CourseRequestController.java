package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.CourseRequest;
import com.lti.exception.NoSuchCourseException;
import com.lti.service.CourseRequestService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CourseRequestController {

	@Autowired
	private CourseRequestService service;
	
	@PostMapping("/course-request")
	public CourseRequest add(@RequestBody() CourseRequest cr) {
		return this.service.addRequest(cr);
	}
	
	@GetMapping("/course-request/{id}")
	public CourseRequest get(@PathVariable("id") int id) {
		CourseRequest cr;
		try {
			cr = this.service.getStatus(id);
		}catch(NoSuchCourseException e) {
			cr = new CourseRequest();
		}
		
		return cr;
	}
	
	@GetMapping("/course-requests")
	public List<CourseRequest> getAll(){
		return this.service.getAll();
	}
}
