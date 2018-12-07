package com.humanbooster.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humanbooster.spring.model.BoughtArticle;
import com.humanbooster.spring.repository.BoughtArticleRepository;
import com.humanbooster.spring.service.BoughtArticleService;
@Service
public class BoughtArticleServiceImpl implements BoughtArticleService{
	@Autowired
	private BoughtArticleRepository boughtArticleRepository;
	
	@Override
	public BoughtArticle findBoughtArticleById(Integer id) {
		return boughtArticleRepository.findById(id);
	}

	@Override
	public void saveBoughtArticle(BoughtArticle boughtArticle) {
		// TODO Auto-generated method stub
		
	}
}
