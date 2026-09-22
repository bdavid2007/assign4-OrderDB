package data;

public class Order {
	private int orderID;
	private String customerName;
	private String product;
	private double totalAmount;
	private String orderDate;
	
	public void setOrderID(int id) {
		this.orderID = id;
	}
	public int getOrderID() {
		return this.orderID;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerName() {
		return this.customerName;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	public String getProduct() {
		return this.product;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getTotalAmount() {
		return this.totalAmount;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderDate() {
		return this.orderDate;
	}
}