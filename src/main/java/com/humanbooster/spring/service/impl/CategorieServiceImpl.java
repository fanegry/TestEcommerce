package com.humanbooster.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humanbooster.spring.model.Categorie;
import com.humanbooster.spring.repository.CategorieRepository;
import com.humanbooster.spring.service.CategorieService;




@Service
public class CategorieServiceImpl implements CategorieService{
	@Autowired
	private CategorieRepository categorieRepository;
	
	@Override
	public Categorie findCategorieById(Integer id) {
		return categorieRepository.findById(id);
	}

	@Override
	public void saveCategorie(Categorie categorie) { //add crud metho
		categorieRepository.save(categorie);
	}

	@Override
	public List<Categorie> findAll() {
		return categorieRepository.findAll();
	}

	@Override
	public Categorie findById(Integer id) {
		return categorieRepository.findById(id);
	}

}
