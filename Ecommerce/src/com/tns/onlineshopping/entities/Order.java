package src.com.tns.onlineshopping.entities;

public class Order {
	private int orderId;
	private Customer customer;
	private Product prodect;
	private String status;
	
	public Order(int orderId,Customer customer) {
		this.orderId = orderId;
		this.customer = customer;
		this.status ="Pending";
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProdect() {
		return prodect;
	}
	public void setProdect(Product prodect) {
		this.prodect = prodect;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@override
	public String toString()
	{
		return "Order(orderId="+orderId+",customer="+customer.getUsername()+,",Items="+items+",status='"+status+'\''+"',prodect="+(prodect!=null? prodect.getName():""
				+ "Not Assigned")+'}';
	}

	
}
