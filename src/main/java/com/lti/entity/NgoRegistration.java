package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NgoRegistration {
	@Id
	private String username;
	private String password;
	private String ngoName;
	private String contact;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNgoName() {
		return ngoName;
	}

	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}
