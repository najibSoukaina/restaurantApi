package com.iticsolution;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iticsolution.entitie.Categorie;
import com.iticsolution.entitie.Produit;
import com.iticsolution.repositories.CategorieRepositorie;
import com.iticsolution.repositories.ProduitRepositorie;
import com.iticsolution.services.CategorieService;
import com.iticsolution.services.ProduitService;

@SpringBootApplication
public class RestoappApplication implements CommandLineRunner {
	/*
	 * @Autowired ProduitRepositorie produitRepositorie;
	 * 
	 * @Autowired CategorieRepositorie categorieRepositorie;
	 */
	@Autowired
	ProduitService  prodServ;
	@Autowired
	CategorieService catServ;
	/*
	 * public RestoappApplication(ProduitRepositorie
	 * produitRepositorie,CategorieRepositorie categorieRepositorie) {
	 * this.produitRepositorie=produitRepositorie;
	 * this.categorieRepositorie=categorieRepositorie; }
	 */

	public static void main(String[] args) {
		SpringApplication.run(RestoappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//Ajout
		Categorie cat1 =new Categorie();
		cat1.setNom("Cat 1");
		catServ.saveCategory(cat1);
		Categorie cat2 =new Categorie();
		cat2.setNom("Cat 2");
		catServ.saveCategory(cat2);
		Categorie cat3 =new Categorie();
		cat3.setNom("Cat 3");
	Categorie catSaved=catServ.saveCategory(cat3);
	
	Produit p1 =new Produit("Produit1", "image", 56.67f, catSaved);
	prodServ.saveProduct(p1);
	Produit p2 =new Produit("Produit2", "image2", 57776.67f, catSaved);
	prodServ.saveProduct(p2);
	//Affichage
	List<Categorie> cats= catServ.getAllCategorys();
	
//	System.out.println("Categorie avec un id= 3"+categorieRepositorie.findById(3L).get().getNom());
	
	for (Categorie cat :cats) {
		
		System.out.println("Nom de categorie :"+cat.getNom());
	}
		
	}

}
