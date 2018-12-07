package com.humanbooster.spring.service;

import com.humanbooster.spring.dto.RegistDTO;
import com.humanbooster.spring.model.User;


public interface UserService {
	public User findUserByEmail(String email);
	/*public void saveUser(User user);*/
	
	public void saveUser(RegistDTO registDTO);

	
	
	
	
	
	
	
	
}
