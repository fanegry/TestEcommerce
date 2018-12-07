package com.humanbooster.spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.humanbooster.spring.model.Categorie;


public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

	Categorie findById(Integer id);




}
