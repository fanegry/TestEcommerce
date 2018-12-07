package com.humanbooster.spring.service;

import com.humanbooster.spring.model.BoughtArticle;

public interface BoughtArticleService {
	public BoughtArticle findBoughtArticleById(Integer id);
	public void saveBoughtArticle(BoughtArticle boughtArticle);
}
