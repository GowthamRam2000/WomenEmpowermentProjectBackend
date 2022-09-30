package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.UserFullData;

@Repository
public interface UserFullDataRepository extends JpaRepository<UserFullData, String>{

}
