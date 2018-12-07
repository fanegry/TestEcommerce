package com.humanbooster.spring.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.humanbooster.spring.model.Article;
import com.humanbooster.spring.model.Categorie;
import com.humanbooster.spring.service.ArticleService;
import com.humanbooster.spring.service.CategorieService;


@Controller
public class CategorieController {
	@Autowired
	private CategorieService categorieService;
	
	@Autowired
	private ArticleService articleService;

	@RequestMapping(value = "/app/categorieList", method = RequestMethod.GET)
	public ModelAndView categorieList() {
		ModelAndView modelAndView = new ModelAndView();
		List<Categorie> categories = categorieService.findAll();
		modelAndView.addObject("categories", categories);
		System.out.println("hey");
		modelAndView.setViewName("connected/categorieList"); // chemin sans filtre
		return modelAndView;
	}

	/* GET RECUP DATA IN PAGE */
	@RequestMapping(value = "/app/createCategorie", method = RequestMethod.GET) // ok
	public ModelAndView createCategorie() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/connected/createCategorie");

		/* need instancier l'objet pour pouvoir l'add/ le créer */

		Categorie categorie = new Categorie();
		modelAndView.addObject("categorie", categorie);

		return modelAndView;
	}

	/* POST SEND DATA IN PAGE */
	@RequestMapping(value = "/app/createCategorie", method = RequestMethod.POST)

	public ModelAndView createNewUser(@Valid Categorie categorie) {

		ModelAndView modelAndView = new ModelAndView("redirect:/app/createCategorie");// ok

		categorieService.saveCategorie(categorie);

		return modelAndView;
	}
	@RequestMapping(value = "/app/articleByC", method = RequestMethod.GET)
	public ModelAndView getArticleByC(@RequestParam("id") Integer id, HttpSession session) {

		ModelAndView mAV = new ModelAndView("articleByC");
		
		Categorie categorie = categorieService.findById(id);
		List<Article> articles = articleService.findByCategorie(new Categorie(id)); 
		
		mAV.addObject("categorie", categorie);
		mAV.addObject("articles", articles);
		
		return mAV;
	}
}