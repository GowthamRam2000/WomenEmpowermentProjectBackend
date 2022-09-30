package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Course;
import com.lti.service.CourseService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CourseController {

	@Autowired
	private CourseService service;
	
	@PostMapping("/course")
	public void add(@RequestBody() Course c) {
		this.service.addCoruse(c);
	}
	
	@GetMapping("/courses")
	public List<Course> get(){
		return this.service.getAllCourses();
	}
	
	@GetMapping("/course/{id}")
	public Course getCourse(@PathVariable("id") int id) {
		Course course;
		
		try {
			course = this.service.getCourseById(id);
		}catch(Exception e) {
			course = new Course();
		}
		
		return course;
	}
}
