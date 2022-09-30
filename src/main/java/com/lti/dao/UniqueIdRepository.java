package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.UniqueId;

@Repository
public interface UniqueIdRepository extends JpaRepository<UniqueId, Integer> {
	
}
