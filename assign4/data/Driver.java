package data;

public class Driver {

	public static void main(String[] args) {
		OrderDB orderDB = new OrderDB();
		orderDB.loadOrders("orders.txt");
		orderDB.showOrders();
	}
}