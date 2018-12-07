package com.humanbooster.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.humanbooster.spring.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

	Profile findById(Integer id);
	
}
