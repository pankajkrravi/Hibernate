package com.jspiders.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.spring.dao.RegistrationDAO;
import com.jspiders.spring.dto.UserDTO;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationDAO registrationDAO;
	
	public Integer persistUserIntoDB(UserDTO userDTO) {
		return registrationDAO.saveUser(userDTO);
	}
}
