package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.CourseRequest;

@Repository
public interface CourseRequestRepository extends JpaRepository<CourseRequest, Integer> {

}
