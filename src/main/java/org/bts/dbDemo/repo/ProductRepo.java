package org.bts.dbDemo.repo;

import org.bts.dbDemo.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products, Long> {
	
	

}
