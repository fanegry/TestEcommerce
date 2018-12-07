package com.humanbooster.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "boughtArticle")
public class BoughtArticle extends AbstractArticle {

	
	@Column(name = "buyDate")
	@NotEmpty(message = "*Please provide your buyDate")
	private Long buyDate;
	
	@ManyToOne(fetch=FetchType.EAGER)
	protected Ticket order;
	

	public Long getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(Long buyDate) {
		this.buyDate = buyDate;
	}

	public Ticket getOrder() {
		return order;
	}

	public void setOrder(Ticket order) {
		this.order = order;
	}
}
