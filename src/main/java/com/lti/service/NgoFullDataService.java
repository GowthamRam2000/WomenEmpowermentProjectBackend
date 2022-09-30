package com.lti.service;

import com.lti.entity.NgoFullData;
import com.lti.exception.NoSuchNgoException;

public interface NgoFullDataService {
	public void addNgoData(NgoFullData fullData);
	public NgoFullData getFullData(String username) throws NoSuchNgoException;
}
