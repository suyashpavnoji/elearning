package org.elearning.app;

import org.elearning.dto.UserDTO;

public interface IUserManagementApplicationService {
	
	public UserDTO getUserInformation(String username);
	
	public boolean isAuthenticateUser(UserDTO userdto);
	
	public boolean isAuthenticateUser(String username,String password);
	
	public boolean registerUser(UserDTO inputDTO);
	
	public boolean registerTeacher(UserDTO inputDTO);
	
	public boolean registerStudent(UserDTO inputDTO);

}
