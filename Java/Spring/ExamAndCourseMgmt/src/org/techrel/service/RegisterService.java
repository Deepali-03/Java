package org.techrel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techrel.dto.RegisterBean;
import org.techrel.repository.RegisterRepository;

@Service
public class RegisterService {

	@Autowired
	private RegisterRepository registerRepository; 
	
	public int registerUser(RegisterBean registerBean){
		return registerRepository.registerUser(registerBean);
	}
}
