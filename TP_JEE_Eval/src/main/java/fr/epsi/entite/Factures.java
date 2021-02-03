package fr.epsi.entite;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Factures {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	Date date;
	String numero;
	double prix;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Clients client;
	
	@OneToMany(mappedBy="facture")
	private List<LigneFacture> lignesFacture = new ArrayList<LigneFacture>();
	

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}

	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getPrix() {
		return prix;
	}
	
	
	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Clients getClient() {
		return client;
	}
	
	public void setClient(Clients client) {
		this.client = client;
	}

	
	public List<LigneFacture> getLignesFacture() {
		return lignesFacture;
	}
	public void setLignesFacture(List<LigneFacture> lignesFacture) {
		this.lignesFacture = lignesFacture;
	}
}
