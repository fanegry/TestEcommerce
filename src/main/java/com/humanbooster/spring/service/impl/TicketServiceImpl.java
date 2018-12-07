package com.humanbooster.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humanbooster.spring.model.Ticket;
import com.humanbooster.spring.repository.TicketRepository;
import com.humanbooster.spring.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
	private TicketRepository ticketRepository;
	
	@Override
	public Ticket findTicketById(Integer id) {
		return ticketRepository.findById(id);
	}

	@Override
	public void saveTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
