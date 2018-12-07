package com.humanbooster.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.humanbooster.spring.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Role findByRole(String role);

}
