package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.Factures;

public interface FacturesDAO {

	void create(Factures facture);
	
	List<Factures> get();
	
	Factures get(Long id);
}
