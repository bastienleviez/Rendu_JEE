package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.Articles;

public interface ArticlesDAO {
	void create(Articles article);
	List<Articles> get();
}
