package com.humanbooster.spring.service;

import com.humanbooster.spring.model.Ticket;

public interface TicketService {
	public Ticket findTicketById(Integer id);
	public void saveTicket(Ticket ticket);
}
