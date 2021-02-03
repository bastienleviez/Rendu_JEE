package fr.epsi.service;

import java.util.List;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import fr.epsi.dao.ArticlesDAO;
import fr.epsi.dao.ArticlesDAOImpl;
import fr.epsi.dto.ArticlesDTO;
import fr.epsi.entite.Articles;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ArticlesServiceImpl implements ArticlesService{
	
	@PersistenceContext
	EntityManager entity;
	
	@Resource
	UserTransaction usertrans;
	
	public void create(ArticlesDTO articles) {
		Articles newarticles = new Articles();
		newarticles.setNom(articles.getNom());
		newarticles.setPrix(articles.getPrix());
		ArticlesDAO articlesdao=new ArticlesDAOImpl(entity, usertrans);
		articlesdao.create(newarticles);
	}
	
	public List<Articles> get(){
		ArticlesDAO articlesdao=new ArticlesDAOImpl(entity, usertrans);
		return articlesdao.get();
	}
}
