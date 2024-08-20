package com.tns.onlineshopping.entities;

public class product {
      private static final int stockQuaninty = 0;
	private int productId;
      private String name;
      private double price;
      private int stockQuantity;
      
      public product(int productId,String name,double price,int stockQuantiy) {
    	  this.productId = productId;
    	  this.name = name;
    	  this.stockQuantity = stockQuantity;
      }
         public int getproductId() {return productId;}
         public void setproductId(int productId) { this.productId = productId;}
         public String getname() { return name;}
         public void setname (String name) { this.name = name;}
         public double getprice() { return price;}
         public void setprice(double price)  { this.price = price; }
         public int getStockQuaninty() { return stockQuaninty;}
         public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }
         
         @override
         public String toString() {
        	 return "product [productId=" + productId +", name= " +name + ", price=" + price +", stockQuantity=" + stockQuantity +"]";
         }
}


        	 
        	 
         

         
         
      
      
      
      

