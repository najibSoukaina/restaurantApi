package com.iticsolution.entitie;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_cat;
	private String nom;
	@OneToMany(mappedBy = "categorie")
	private List<Produit> produits;
	public Long getId_cat() {
		return id_cat;
	}
	public void setId_cat(Long id_cat) {
		this.id_cat = id_cat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	public Categorie(String nom, List<Produit> produits) {
		super();
		this.nom = nom;
		this.produits = produits;
	}
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
