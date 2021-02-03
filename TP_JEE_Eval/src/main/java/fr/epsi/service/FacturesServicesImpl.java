package fr.epsi.service;

import java.util.ArrayList;
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
import fr.epsi.dao.ClientsDAO;
import fr.epsi.dao.ClientsDAOImpl;
import fr.epsi.dao.FacturesDAO;
import fr.epsi.dao.FacturesDAOImpl;
import fr.epsi.dto.ArticlesDTO;
import fr.epsi.dto.ClientsDTO;
import fr.epsi.entite.Articles;
import fr.epsi.entite.Clients;
import fr.epsi.entite.Factures;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class FacturesServicesImpl implements FacturesService {

	
	@PersistenceContext
	EntityManager entity;
	
	@Resource
	UserTransaction usertrans;

	public List<Factures> get() {
		FacturesDAO facturesdao=new FacturesDAOImpl(entity, usertrans);
		return facturesdao.get();	
	}

	public Factures get(Long id) {
		FacturesDAO facturesdao=new FacturesDAOImpl(entity, usertrans);
		return facturesdao.get(id);	
	}
}
