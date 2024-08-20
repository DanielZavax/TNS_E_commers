package com.tns.onlineshopping.entities;

public class productQuantitypair {
	private product product;
	private int quantity;
	
	public productQuantitypair(product product,int quantity) {
		this.product= product;
		this.quantity = quantity;
	}
		
		public productQuantitypair(Product product, int quantity) {
               this.product= product;
               this.quantity = quantity;
		}
		public product getProduct() {
			return product;
		}
		public void setProduct(product product) {
			this.product = product;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
	}

