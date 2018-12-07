package com.humanbooster.spring.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.humanbooster.spring.dto.ArticleDTO;
import com.humanbooster.spring.model.Article;
import com.humanbooster.spring.service.ArticleService;
import com.humanbooster.spring.service.CategorieService;


@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	@Autowired
	private CategorieService categorieService;

	/* GET RECUP DATA IN PAGE */
	@RequestMapping(value = "/app/create_article", method = RequestMethod.GET) // ok
	public ModelAndView createArticle() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/connected/createArticle");
		/* need instancier l'objet pour pouvoir l'add/ le créer */

		ArticleDTO articleDTO = new ArticleDTO();
		modelAndView.addObject("articleDTO", articleDTO);
		modelAndView.addObject("categories", categorieService.findAll()); // todo select option
		return modelAndView;
	}

	@RequestMapping(value = "/app/create_article", method = RequestMethod.POST)
	public ModelAndView createArticle(@Valid ArticleDTO articleDTO) {
		System.out.println("debPOST");
		ModelAndView modelAndView = new ModelAndView();
		
		Article article = new Article();
		article.setName(articleDTO.getName());
		article.setNbPoints(articleDTO.getNbPoints());
		article.setPrice(articleDTO.getPrice());
		article.setStock(articleDTO.getStock());
		article.setVisible(articleDTO.getVisible());
	

		
		article.setCategorie(categorieService.findCategorieById(articleDTO.getCategorie().getId()));
		articleService.createArticle(article);

		modelAndView.addObject("categories", categorieService.findAll());
		System.out.println(article.toString());
		modelAndView.setViewName("/connected/createArticle"); //page dossrac
		System.out.println("endPOST");
		return modelAndView;
	}
	
	@RequestMapping(value = "/app/article", method = RequestMethod.GET)
	public ModelAndView getArticle(@RequestParam("id") Integer id, HttpSession session) {
		ModelAndView mAV = new ModelAndView("article");
		
		mAV.addObject("article", articleService.findArticleById(id));
		
		
		
		return mAV;
	}

	
}