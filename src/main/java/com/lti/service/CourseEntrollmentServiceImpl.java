package com.lti.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.CourseEnrollmentRepository;
import com.lti.entity.CourseEnrollment;

@Service
public class CourseEntrollmentServiceImpl implements CourseEnrollmentService {
	@Autowired
	private CourseEnrollmentRepository repo;
	
	@Override
	@Transactional
	public void enrollCourse(CourseEnrollment enroll) {
		this.repo.save(enroll);
	}		
}
