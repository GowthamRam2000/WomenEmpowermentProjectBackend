package com.lti.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.entity.NgoRegistration;
import com.lti.entity.UserRegistration;

@Repository
public interface NgoRegisterRepository extends JpaRepository<NgoRegistration, String> {

	@Query(value="SELECT * from NGO_REGISTRATION e where e.USERNAME=?1 AND e.PASSWORD = ?2",nativeQuery=true)
	public Optional<NgoRegistration> findByUserNamePassword(String username,String password);
}
