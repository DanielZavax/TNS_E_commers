package com.tns.onlineshopping.entities;


	

	import java.util.ArrayList;

	public class ProductService {
		
		private List<Product> productList = new ArrayList<>();
		
		public void addProduct (Product product) {
			productList.add(product);
		}
		
		public void removeProduct(int ProductId) {
			return productList.stream()
					.filter(Product -> Product.getProductId() == ProductId)
					.findFirst()
					.orElse(null);
					
		}

	}


}
