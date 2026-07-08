package org.bts.dbDemo.controller;

import org.bts.dbDemo.model.Products;
import org.bts.dbDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	public Products getProducts() {
		return null;
	}
	
	@PostMapping("/createProduct")
	public Products createProduct(@RequestBody Products products) {
		return service.addNewProduct(products);
	}
	
	public Products updateProduct() {
		return null;
	}
	
	public Products deleteProduct() {
		return null;
	}

}
