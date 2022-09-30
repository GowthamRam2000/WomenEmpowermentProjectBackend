package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.CourseEnrollment;
import com.lti.service.CourseEnrollmentService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CourseEntrollmentController {
	@Autowired
	private CourseEnrollmentService enrollService;
	
	@PostMapping("/enroll-course")
	public void enroll(@RequestBody() CourseEnrollment course) {
		this.enrollService.enrollCourse(course);
	}
}
