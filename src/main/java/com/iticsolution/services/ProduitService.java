package com.iticsolution.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iticsolution.entitie.Produit;
import com.iticsolution.repositories.ProduitRepositorie;

@Service
public interface ProduitService {
	
	public Produit saveProduct(Produit p);
	public Produit FindProductById(Long id); 
	public List<Produit> getAllProducts();
	public void deleteProduct(Long id);
	public void updateProduct(Produit p);
	
	

}
