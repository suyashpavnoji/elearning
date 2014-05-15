package org.elearning.dto;


public class UserDTO extends AbstractDTO {

	private String firstName;

	private String lastName;
	
	private boolean isAuthenticated=false;

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

	private String emailId;

	private String password;

	private String username;

	public UserDTO(String emailId, String password, String username) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.username = username;
	}

	public UserDTO(String username, String password) {
		super();
		this.emailId = username;
		this.password = password;
		this.username = username;
	}

	public boolean isAuthenticated() {
		return isAuthenticated;
	}

	public void setAuthenticated(boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
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
