package com.iticsolution.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iticsolution.entitie.Categorie;
import com.iticsolution.entitie.Produit;
import com.iticsolution.repositories.ProduitRepositorie;

@Service
public interface CategorieService {
	
	public Categorie saveCategory(Categorie c);
	public Categorie FindCategoryById(Long id); 
	public List<Categorie> getAllCategorys();
	public void deleteCategorie(Long id);
	public void updateCategorie(Categorie c);
	
	

}
