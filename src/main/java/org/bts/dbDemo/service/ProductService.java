package org.bts.dbDemo.service;

import org.bts.dbDemo.model.Products;
import org.bts.dbDemo.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductRepo repo;
	
	public Products addNewProduct(Products products) {
		return repo.save(products);
	}

}
