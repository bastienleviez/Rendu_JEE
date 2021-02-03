package fr.epsi.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Clients;

public class ClientsDAOImpl implements ClientsDAO{

	EntityManager entity;
	
	UserTransaction usertrans;

	public ClientsDAOImpl(EntityManager entity, UserTransaction usertrans) {
		this.entity=entity;
		this.usertrans=usertrans;
	}
	
	public void create(Clients client) {
		try {
			usertrans.begin();
			entity.persist(client);
			
			usertrans.commit();
		} catch (NotSupportedException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (RollbackException e) {
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			e.printStackTrace();
		}
		
		
	}

	public List<Clients> get() {
		return entity.createQuery("Select client from Clients client", Clients.class).getResultList();
	}
}
