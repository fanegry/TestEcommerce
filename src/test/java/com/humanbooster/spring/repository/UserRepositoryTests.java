package com.humanbooster.spring.repository;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.humanbooster.spring.model.User;
import com.humanbooster.spring.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {

	@Autowired
	private UserRepository userRepository;
	
	private String emailTest = "john.doe@test.fr";
	
	private User userTest;
	
	@Before
	public void beforeTest() {
		User user = new User();
		user.setEmail(this.emailTest);
		user.getProfile().setLastname("Doe");
		user.getProfile().setFirstname("John");
		user.setPassword("testt");
		
		this.userTest = userRepository.save(user);
	}
	
	@After
	public void afterTest() {
		userRepository.delete(userTest);
	}
	
	@Test
	public void testGetUserByEmail() {
		User dbUser = userRepository.findByEmail(this.emailTest);
		
		assertThat(dbUser, is(notNullValue()));
	}
	
	@Test
	public void testGetUserById() {
		User dbUser = userRepository.findById(this.userTest.getId());
		
		assertThat(dbUser, is(notNullValue()));
	}

}
