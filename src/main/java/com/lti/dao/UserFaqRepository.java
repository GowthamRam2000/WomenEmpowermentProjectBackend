package com.lti.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.entity.NgoFaq;
import com.lti.entity.UserFaq;

@Repository
public interface UserFaqRepository extends JpaRepository<UserFaq,Integer> {
	@Query(value = "SELECT * FROM USER_FAQ e WHERE e.username = ?1",nativeQuery=true)
	public List<UserFaq> findByUsername(String username);
}
