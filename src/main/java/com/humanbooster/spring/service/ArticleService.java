package com.humanbooster.spring.service;

import java.util.List;

import com.humanbooster.spring.dto.ArticleDTO;
import com.humanbooster.spring.model.Article;
import com.humanbooster.spring.model.Categorie;


public interface ArticleService {
	
	public Article findArticleById(Integer id);

	public void saveArticle(ArticleDTO articleDTO);
	public ArticleDTO createArticleDTO();
	public List<Article> findAll();
	public void createArticle(Article article);

	List<Article> findByCategorie(Categorie categorie);




}
