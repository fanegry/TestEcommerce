package com.humanbooster.spring.service;

import java.util.List;

import com.humanbooster.spring.model.Categorie;

public interface CategorieService {
	public Categorie findCategorieById(Integer id);
	public void saveCategorie(Categorie categorie);
	public List<Categorie> findAll();
	public Categorie findById(Integer id);

	
}
