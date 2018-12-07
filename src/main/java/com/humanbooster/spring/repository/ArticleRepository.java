package com.humanbooster.spring.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.humanbooster.spring.model.Article;
import com.humanbooster.spring.model.Categorie;



public interface ArticleRepository extends JpaRepository<Article, Integer> { // attent Interger=  type de la clé primaire

	Article findById(Integer id);
	List<Article> findByCategorie();
	List<Article> findByCategorie(Categorie categorie);
}
