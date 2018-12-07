package com.humanbooster.spring.dto;

import com.humanbooster.spring.model.Categorie;

public class ArticleDTO {

	private Integer id;
	private String name;
	private Long nbPoints;
	private Long price;
	
	private int stock;
	protected Categorie categorie;
	private Boolean visible;
	
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
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Boolean getVisible() {
		return visible;
	}
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
	public ArticleDTO() {
		super();
	}
}
