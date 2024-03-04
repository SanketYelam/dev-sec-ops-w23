package org.dnyanyog.service;

import java.util.List;

import org.dnyanyog.common.ResponseCode;
import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;
import org.dnyanyog.encryption.EncryptionService;
import org.dnyanyog.entity.Users;
import org.dnyanyog.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	UsersRepository userRepo;

	@Autowired
	EncryptionService encryptionService;

	public LoginResponse validateUser(LoginRequest loginRequest) throws Exception {
		LoginResponse response = new LoginResponse();

		List<Users> receivedData = userRepo.findByUsername(loginRequest.getUsername());

		if (receivedData.size() == 1) {
			Users userData = receivedData.get(0);
			String encryptedPassword = userData.getPassword();
			String requestPassword = encryptionService.encrypt(loginRequest.getPassword());

			if (requestPassword.equalsIgnoreCase(encryptedPassword)) {
				response.setStatus(ResponseCode.LOGIN_SUCCESS.getStatus());
				response.setMessage(ResponseCode.LOGIN_SUCCESS.getMessage());
			} else {
				response.setStatus(ResponseCode.INVALID_USERNAME_PASSWORD.getStatus());
				response.setMessage(ResponseCode.INVALID_USERNAME_PASSWORD.getMessage());
			}
		} else {
			response.setStatus(ResponseCode.USER_NOT_PRESENT.getStatus());
			response.setMessage(ResponseCode.USER_NOT_PRESENT.getMessage());
		}

		return response;
	}

}
