package com.tns.onlineshopping.entities;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	private Map<Product,  Integer>  items;
	
	public ShoppingCart() {
		this.items = new HashMap<>();
		}

	public Map<Product, Integer> getItems() {
		return items;
	}

	public void addItems(Product product, int quantity) {
		items.put(product, quantity);
	}
	public void removeItem(Product product) {
		items.remove(product);
	}
   public String toString() {
	   return"ShoppingCart [items=" +items + "]";
	   
   }
}
