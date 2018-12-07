package com.humanbooster.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.humanbooster.spring.model.BoughtArticle;



public interface BoughtArticleRepository extends JpaRepository<BoughtArticle, Long>{

	BoughtArticle findById(Integer id);
}
