package org.bts.dbDemo.service;

import java.util.List;

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
		// insert into products (productid, name, price, qty) values (products.getProductid, products.getName, products.getPrice, products.getqty)
	}
	
	public List<Products> getProducts() {
			return repo.findAll();
	}
	
	public Products updateProduct(Products product) {
		return repo.save(product);
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}

}
