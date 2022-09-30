package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.NgoFullData;

@Repository
public interface NgoFullDataRepository extends JpaRepository<NgoFullData,String> {

}
