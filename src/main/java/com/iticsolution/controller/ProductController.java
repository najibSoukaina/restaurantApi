package com.iticsolution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iticsolution.entitie.Produit;
import com.iticsolution.services.ProduitService;

@RestController
public class ProductController {
	
	@Autowired
	ProduitService prodServ;
	
	//@GetMapping(value = "/products")
	@RequestMapping(value  = "/products",method = RequestMethod.GET)
	public List<Produit> getAllProduct(){
		return  prodServ.getAllProducts();
	}

}
