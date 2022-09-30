package com.lti.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lti.entity.UserRegistration;

@Repository
public interface UserRegisterRepository extends JpaRepository<UserRegistration, String> {
	
	@Query(value="SELECT * from USER_LOGIN_REGISTRATION e where e.USER_NAME=?1 AND e.PASSWORD = ?2",nativeQuery=true)
	public Optional<UserRegistration> findByUserNamePassword(String username,String password);
}
