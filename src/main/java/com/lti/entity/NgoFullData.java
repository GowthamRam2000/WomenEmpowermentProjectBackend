package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NgoFullData {
	@Id
	private String username;
	private String orgName;
	private String founder;
	private String startedIn;
	private String regId;
	private String domain;
	private long netWorth;

	private String picFName;
	private String picLName;
	private String picExperience;
	private String projectName;

	private String phoneNo;
	private String email;
	private String address;
	private String city;
	private String state;


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getStartedIn() {
		return startedIn;
	}

	public void setStartedIn(String startedIn) {
		this.startedIn = startedIn;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public long getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(long netWorth) {
		this.netWorth = netWorth;
	}

	public String getPicFName() {
		return picFName;
	}

	public void setPicFName(String picFName) {
		this.picFName = picFName;
	}

	public String getPicLName() {
		return picLName;
	}

	public void setPicLName(String picLName) {
		this.picLName = picLName;
	}

	public String getPicExperience() {
		return picExperience;
	}

	public void setPicExperience(String picExperience) {
		this.picExperience = picExperience;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
