package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.NgoCourseStatus;

@Repository
public interface NgoCourseStatusRepository extends JpaRepository<NgoCourseStatus,Integer>{
	
}
