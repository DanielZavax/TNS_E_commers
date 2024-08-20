package com.tns.onlineshopping.services;

import java.util.ArrayList;
import java.util.List;

import com.tns.onlineshopping.entities.Product;

public class ProductService {
	
	private List<Product> productList = new ArrayList<>();
	
	public void addProduct (Product product) {
		productList.add(product);
	}
	
	public Product removeProduct(int ProductId) {
		return productList.stream()
				.filter(Product -> Product.getProductId() == ProductId)
				.findFirst()
				.orElse(null);
				
	}

}
