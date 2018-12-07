package com.humanbooster.spring.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ticket_id")
	private Integer id;

@ManyToOne(fetch=FetchType.EAGER)
protected Profile profile;

@OneToMany(mappedBy="order", fetch=FetchType.LAZY)
private List<BoughtArticle> BoughtArticles;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Profile getProfile() {
	return profile;
}

public void setProfile(Profile profile) {
	this.profile = profile;
}

public List<BoughtArticle> getBoughtArticles() {
	return BoughtArticles;
}

public void setBoughtArticles(List<BoughtArticle> boughtArticles) {
	BoughtArticles = boughtArticles;
}

}
