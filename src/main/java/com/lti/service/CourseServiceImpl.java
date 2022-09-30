package com.lti.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.CourseRepository;
import com.lti.entity.Course;
import com.lti.exception.NoSuchCourseException;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository courseRepo;
	
	@Override
	@Transactional
	public void addCoruse(Course c) {
		this.courseRepo.save(c);
	}

	@Override
	public List<Course> getAllCourses() {
		return this.courseRepo.findAll();
	}

	@Override
	public Course getCourseById(int id) throws NoSuchCourseException {
		Optional<Course> opt =  this.courseRepo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new NoSuchCourseException();
		}
	}
}
