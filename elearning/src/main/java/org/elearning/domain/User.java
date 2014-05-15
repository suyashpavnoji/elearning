package org.elearning.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="elearn_user")
public class User {
	
	@Column(name="email_id",nullable=false)
	private String emailId;
	
	@Column(name="password" ,nullable=false)
	private String password;
	
	@Column(name="first_name" ,nullable=false)
	private String firstName;
	
	@Column(name="last_name" ,nullable=false)
	private String lastName;
	
	@Id
	@Column(name="username",nullable=false)
	private String username;

	public User(String emailId, String password, String username) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.username = username;
	}
	
	public User(String username,String password) {
		super();
		this.emailId = username;
		this.password = password;
		this.username = username;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
