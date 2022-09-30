package com.lti.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.entity.NgoFaq;

@Repository
public interface NgoFaqRepository extends JpaRepository<NgoFaq, Integer>{
	
	@Query(value = "SELECT * FROM NGO_FAQ e WHERE e.username = ?1",nativeQuery=true)
	public List<NgoFaq> findByUsername(String username);
}
