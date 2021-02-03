package fr.epsi.service;

import java.util.List;

import fr.epsi.dto.ClientsDTO;
import fr.epsi.entite.Clients;

public interface ClientsService {
	
	void create(ClientsDTO clients);
	
	List<Clients> get();
}
