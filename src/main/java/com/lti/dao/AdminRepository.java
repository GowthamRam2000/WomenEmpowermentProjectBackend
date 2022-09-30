package com.lti.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
	
	@Query(value="SELECT * FROM ADMIN a WHERE a.username = ?1 AND a.password = ?2",nativeQuery=true)
	public Optional<Admin> isAdminValid(String username, String password);
}
