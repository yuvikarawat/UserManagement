package com.user.service;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int userId;
	private String fullName;
	private String firstName;
	private String middleName;
	private String lastName;
	private String userName;
	private String status;
	private String role;


	public User(int userId, String fullName, String firstName, String middleName,String lastName, String userName, String status, String role) {
		
		this.userId=userId;
		this.fullName = fullName;
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
		this.userName=userName;
		this.status=status;
		this.role=role;
		

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	@XmlElement
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFirstName() {
		return firstName;
	}

	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	public String getMiddleName() {
		return middleName;
	}

	@XmlElement
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	@XmlElement
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	@XmlElement
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStatus() {
		return status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@XmlElement
	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}