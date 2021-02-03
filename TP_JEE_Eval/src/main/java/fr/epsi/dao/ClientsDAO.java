package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.Clients;

public interface ClientsDAO {
	
	void create(Clients client);
	List<Clients> get();
	
}
