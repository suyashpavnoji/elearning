package org.elearning.app;

import org.elearning.dto.UserDTO;

public class UserManagementApplicationService extends
		AbstractApplicationService implements IUserManagementApplicationService {

	@Override
	public UserDTO getUserInformation(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAuthenticateUser(UserDTO userdto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAuthenticateUser(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean registerUser(UserDTO inputDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean registerTeacher(UserDTO inputDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean registerStudent(UserDTO inputDTO) {
		// TODO Auto-generated method stub
		return false;
	}

}
