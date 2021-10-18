package com.iticsolution.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iticsolution.entitie.Categorie;
import com.iticsolution.repositories.CategorieRepositorie;

@Service
public class CategorieServiceImpl implements CategorieService {

	@Autowired
	CategorieRepositorie repositorie;
	@Override
	public Categorie saveCategory(Categorie c) {
		// TODO Auto-generated method stub
		return repositorie.save(c);
	}

	@Override
	public Categorie FindCategoryById(Long id) {
		// TODO Auto-generated method stub
		return repositorie.findById(id).get();
	}

	@Override
	public List<Categorie> getAllCategorys() {
		// TODO Auto-generated method stub
		return repositorie.findAll();
	}

	@Override
	public void deleteCategorie(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCategorie(Categorie c) {
		// TODO Auto-generated method stub
		
	}

}
