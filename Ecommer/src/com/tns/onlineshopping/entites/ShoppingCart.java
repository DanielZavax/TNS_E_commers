package com.tns.onlineshopping.entites;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	private Map<Product,  Interger>  items;
	
	public ShoppingCart() {
		this.items = new HashMap<>();
		}

	public Map<Product, Interger> getItems() {
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
