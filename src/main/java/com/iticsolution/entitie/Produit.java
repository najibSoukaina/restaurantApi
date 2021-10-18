package com.iticsolution.entitie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Long id_art;
	private String Designation;
	private String image;
	private float prix_ht;
	@ManyToOne
	private Categorie categorie;
	public Long getId_art() {
		return id_art;
	}
	public void setId_art(Long id_art) {
		this.id_art = id_art;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public float getPrix_ht() {
		return prix_ht;
	}
	public void setPrix_ht(float prix_ht) {
		this.prix_ht = prix_ht;
	}
	
	@JsonIgnore
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	
	public Produit(String designation, String image, float prix_ht, Categorie categorie) {
		super();
		Designation = designation;
		this.image = image;
		this.prix_ht = prix_ht;
		this.categorie = categorie;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
