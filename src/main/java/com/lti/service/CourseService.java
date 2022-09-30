package com.lti.service;

import java.util.List;

import com.lti.entity.Course;
import com.lti.exception.NoSuchCourseException;

public interface CourseService {
	public void addCoruse(Course c);
	public List<Course> getAllCourses();
	
	public Course getCourseById(int id) throws NoSuchCourseException;
}
