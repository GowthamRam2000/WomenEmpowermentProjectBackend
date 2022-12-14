package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lti.entity.CourseEnrollment;

@Repository
public interface CourseEnrollmentRepository extends JpaRepository<CourseEnrollment, Integer>{
	
}
