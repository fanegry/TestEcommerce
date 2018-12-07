package com.humanbooster.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.humanbooster.spring.model.Ticket;



public interface TicketRepository extends JpaRepository<Ticket, Long> {

	 Ticket findById(Integer id);
	
}
