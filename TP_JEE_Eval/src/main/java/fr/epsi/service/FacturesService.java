package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Factures;

public interface FacturesService {

	List<Factures> get();
	
	Factures get(Long id);
}
