package com.humanbooster.spring.service.impl;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.humanbooster.spring.dto.RegistDTO;
import com.humanbooster.spring.model.Profile;
import com.humanbooster.spring.model.Role;
import com.humanbooster.spring.model.User;
import com.humanbooster.spring.repository.ProfileRepository;
import com.humanbooster.spring.repository.RoleRepository;
import com.humanbooster.spring.repository.UserRepository;
import com.humanbooster.spring.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private ProfileRepository profileRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	/*
	 * @Override public void saveUser(User user) {
	 * user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	 * user.setActive(1); Role userRole = roleRepository.findByRole("ROLE_USER");
	 * user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
	 * userRepository.save(user); }
	 */

	@Override
	public void saveUser(RegistDTO registDTO) {
		User user = new User();
		Profile profile = new Profile();
		user.setEmail(registDTO.getEmail());
		profile.setFirstname(registDTO.getFirstname());
		profile.setLastname(registDTO.getLastname());
		profile.setFirstname(registDTO.getFirstname());
		
		profileRepository.save(profile);
		System.out.println(profile);
		user.setProfile(profile);
		user.setPassword(bCryptPasswordEncoder.encode(registDTO.getPassword()));
		user.setActive(1);
		Role userRole = roleRepository.findByRole("ROLE_USER");
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
		System.out.println(user);
	}

}
