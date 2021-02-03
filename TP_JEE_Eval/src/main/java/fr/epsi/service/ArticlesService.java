package fr.epsi.service;

import java.util.List;

import fr.epsi.dto.ArticlesDTO;
import fr.epsi.entite.Articles;

public interface ArticlesService {

	void create(ArticlesDTO articles);
	
	List<Articles> get()
;}
