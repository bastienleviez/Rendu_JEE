package fr.epsi.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneFacture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	int qte;
	double prix;
	
	@ManyToOne
	@JoinColumn(name = "facture_id")
	private Factures facture;
	
	@ManyToOne
	@JoinColumn(name = "article_id")
	private Articles article;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public int getQte() {
		return qte;
	}
	
	public void setQte(int qte) {
		this.qte = qte;
	}

	
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}

	
	public void setFacture(Factures facture) {
		this.facture = facture;
	}
	public Factures getFacture() {
		return facture;
	}
	
	
	public Articles getArticle() {
		return article;
	}
	public void setArticle(Articles article) {
		this.article = article;
	}


	
}
