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
import fr.epsi.dto.ArticlesDTO;
import fr.epsi.dto.ClientsDTO;
import fr.epsi.entite.Articles;
import fr.epsi.entite.Clients;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ClientsServiceImpl implements ClientsService {
	
	@PersistenceContext
	EntityManager entity;
	
	@Resource
	UserTransaction usertrans;
	
	public void create(ClientsDTO clients) {
		Clients newclients = new Clients();
		newclients.setNom(clients.getNom());
		newclients.setAdresse(clients.getAdress());
		ClientsDAO clientsdao=new ClientsDAOImpl(entity, usertrans);
		clientsdao.create(newclients);
	}

	public List<Clients> get() {
		ClientsDAO clientsdao=new ClientsDAOImpl(entity, usertrans);
		return clientsdao.get();
		
	}
}
