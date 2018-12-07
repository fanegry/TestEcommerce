package com.humanbooster.spring.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "profile")
public class Profile{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "profile_id")
	private Long id;
	
	@Column(name = "lastname")
	@NotEmpty(message = "*Please provide an lastname")
	private String lastname;
	
	@Column(name = "firstname")
	@NotEmpty(message = "*Please provide an firstname")
	private String firstname;
	
	@Column(name = "totalpoints")
	private Long totalpoints;
	

	
	
	@OneToMany(mappedBy="profile", fetch=FetchType.LAZY)
	private List<Ticket> orders;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Long getTotalpoints() {
		return totalpoints;
	}

	public void setTotalpoints(Long totalpoints) {
		this.totalpoints = totalpoints;
	}


	public List<Ticket> getOrders() {
		return orders;
	}

	public void setOrders(List<Ticket> orders) {
		this.orders = orders;
	}

	public Profile() {
		super();
	}

	public Profile(Long id, String lastname, String firstname) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
	}
	

	
}
