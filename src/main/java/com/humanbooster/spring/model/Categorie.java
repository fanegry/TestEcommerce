package com.humanbooster.spring.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name = "categorie")
public class Categorie{



	@Override
	public String toString() {
		return "Categorie [name=" + name + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "categorie_id")
	private Integer id;

	@Column(name = "name")
	@NotEmpty(message = "*Please provide an name")
	private String name;
	
	//TODO-------------------------------------------------------
	@OneToMany(mappedBy="categorie", fetch=FetchType.LAZY)
	private List<Article> articles;
	
	
	public Categorie() {
		super();
	}
	
	

	public Categorie(Integer id2) {
		// TODO Auto-generated constructor stub
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
