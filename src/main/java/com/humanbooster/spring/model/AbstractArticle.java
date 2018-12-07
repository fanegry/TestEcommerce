package com.humanbooster.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


/* la class abstraite n'a pas de table et n'est pas une entité mais une mappedSuperClass*/

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractArticle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "article_id")
	private Integer id;
	
	@Column(name = "name")
	@NotEmpty(message = "*Please provide an name")
	private String name;
	
	@Column(name = "nbPoints")
	private Long nbPoints;
	
	@Column(name = "price")
	private Long price;
	

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

	public Long getNbPoints() {
		return nbPoints;
	}

	public void setNbPoints(Long nbPoints) {
		this.nbPoints = nbPoints;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}
}
