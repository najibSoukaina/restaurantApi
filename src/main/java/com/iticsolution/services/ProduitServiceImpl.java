package com.iticsolution.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iticsolution.entitie.Produit;
import com.iticsolution.repositories.ProduitRepositorie;

@Service
public class ProduitServiceImpl implements ProduitService {

	@Autowired
	ProduitRepositorie repositorie;
	@Override
	public Produit saveProduct(Produit p) {
		
		return repositorie.save(p);
	}

	@Override
	public Produit FindProductById(Long id) {
		// TODO Auto-generated method stub
		return repositorie.findById(id).get();
	}

	@Override
	public List<Produit> getAllProducts() {
		// TODO Auto-generated method stub
		return repositorie.findAll();
	}

	@Override
	public void deleteProduct(Long id) {
		repositorie.deleteById(id);

	}

	@Override
	public void updateProduct(Produit p) {
		repositorie.save(p);

	}

}
