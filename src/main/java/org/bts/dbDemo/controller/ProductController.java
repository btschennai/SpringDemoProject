package org.bts.dbDemo.controller;

import java.util.List;

import org.bts.dbDemo.model.Products;
import org.bts.dbDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/listProducts")
	public List<Products> getProducts() {
		return service.getProducts();
	}
	
	@PostMapping("/createProduct")
	public Products createProduct(@RequestBody Products products) {
		return service.addNewProduct(products);
	}
	
	@PutMapping("/updateProduct")
	public Products updateProduct(@RequestBody Products products) {
		return service.updateProduct(products);
	}
	
	//http://localhost:8080/deleteProduct/1003
	@DeleteMapping("/deleteProduct/{id}")
	public void deleteProduct(@PathVariable("id")  long id) {
		service.delete(id);
	}

}
