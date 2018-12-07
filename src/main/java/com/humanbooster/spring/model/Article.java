package com.humanbooster.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name = "article")
public class Article extends AbstractArticle{

	
	@Override
	public String toString() {
		return "Article [stock=" + stock + ", visible=" + visible + ", categorie=" + categorie + "]";
	}

	
	@Min(0)
	@Column(name = "stock")
	private Integer stock;
	
	@Column(name = "visible")
	private Boolean visible;
	
	@ManyToOne(fetch=FetchType.EAGER)
	protected Categorie categorie;
	
	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

}
