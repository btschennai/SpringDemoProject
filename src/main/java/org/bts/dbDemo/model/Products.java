package org.bts.dbDemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Products {
	
	@Column
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long productid;
	

	@Column
	private String name;
	
	@Column
	private long price;
	
	@Column
	private int qty;
	
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

}
