package com.humanbooster.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.humanbooster.spring.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	 User findByEmail(String email);
	 
	 @Query("select u from User u where u.id=:userId")
	 User findById(@Param("userId") Long id);
	 
}
