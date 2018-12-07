package com.humanbooster.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.humanbooster.spring.dto.ArticleDTO;
import com.humanbooster.spring.model.Article;
import com.humanbooster.spring.model.Categorie;
import com.humanbooster.spring.repository.ArticleRepository;
import com.humanbooster.spring.repository.CategorieRepository;
import com.humanbooster.spring.service.ArticleService;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleRepository articleRepository;
	@Autowired
	private CategorieRepository categorieRepository;

	public Article findArticleById(Integer id) {
		return articleRepository.findOne(id);
	}

	@Override
	public void saveArticle(ArticleDTO articleDTO) {
		// TODO Auto-generated method stub
		Article article = new Article();
		Categorie categorie = new Categorie();
		article.setName(articleDTO.getName());
		article.setNbPoints(articleDTO.getNbPoints());
		article.setPrice(articleDTO.getPrice());
		article.setStock(articleDTO.getStock());
		categorie.setId(articleDTO.getId());
		articleRepository.save(article);
	}

	@Override
	public List<Article> findAll() {

		return articleRepository.findAll();
	}

	@Override
	public ArticleDTO createArticleDTO() {
		ArticleDTO articleDTO = new ArticleDTO();
		articleDTO.getName();
		articleDTO.getNbPoints();
		articleDTO.getPrice();
		articleDTO.getStock();
		articleDTO.getVisible();
		articleDTO.getCategorie();

		return null;

	}

	public void createArticle(Article article) {
		// TODO Auto-generated method stub
		article = articleRepository.save(article);

	}

	@Override
	public List<Article> findByCategorie(Categorie categorie) {	
		return articleRepository.findByCategorie(categorie);
	}




}
