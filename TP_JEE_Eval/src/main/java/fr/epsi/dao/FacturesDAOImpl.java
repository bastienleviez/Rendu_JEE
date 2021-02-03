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
import fr.epsi.entite.Factures;

public class FacturesDAOImpl implements FacturesDAO{
	
	EntityManager entity;
	UserTransaction usertrans;

	public FacturesDAOImpl(EntityManager em, UserTransaction utx) {
		this.entity=entity;
		this.usertrans=usertrans;
	}
	
	public void create(Factures facture) {
		try {
			usertrans.begin();
			entity.persist(facture);
			
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

	public List<Factures> get() {
		return entity.createQuery("Select facture from Factures facture", Factures.class).getResultList();
	}

	public Factures get(Long id) {
		return entity.createQuery("select facture from Facture facture where facture.id = :id", Factures.class)
				.setParameter("id", id)
				.getSingleResult();
	}

}
