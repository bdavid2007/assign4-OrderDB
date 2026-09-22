package data;

import java.io.File;
import java.util.Scanner;

public class OrderDB {
	public Order[] orders;
	
	public void loadOrders(String fileName) {
        try {
			// Initialize countingScanner to first get the number of lines of the file
			Scanner countingScanner = new Scanner(new File(fileName));
			countingScanner.nextLine(); // Skip the header of the CSV

			int fileLength = 0;

            while (countingScanner.hasNextLine()) {
				if (countingScanner.nextLine().equals("")) continue;
				fileLength++;
            }
			countingScanner.close();

			// Add to orders array
			this.orders = new Order[fileLength];

			// Initialize pushingScanner to actually push the data to the array
			Scanner pushingScanner = new Scanner(new File(fileName));
			pushingScanner.nextLine(); // Skip the header of the CSV
			String currentLine;
			String[] currentData;
			int index = 0;

            while (pushingScanner.hasNextLine()) {
				currentLine = pushingScanner.nextLine();
				if (currentLine.equals("")) continue;

				this.orders[index] = new Order();

				// Split and store data
				currentData = currentLine.split(",");
				this.orders[index].setOrderID(Integer.parseInt(currentData[0]));
				this.orders[index].setCustomerName(currentData[1]);
				this.orders[index].setProduct(currentData[2]);
				this.orders[index].setTotalAmount(Double.parseDouble(currentData[3]));
				this.orders[index].setOrderDate(currentData[4]);

				index++;
            }
			pushingScanner.close();
        }
		// Just in case the file is not found
		catch (Exception exception) {
            System.err.println("File not found!: " + exception);
        }
	}
	
	public void showOrders() {
		int index;
		Order order;

		System.out.println("Order ID Product                         Total Amt\n-------- -------                         ---------");

		for (index = 0; index < this.orders.length; index++) {
			order = orders[index];
			
			System.out.printf("%-8d %-31s %9.2f\n", order.getOrderID(), order.getProduct(), order.getTotalAmount());
		}
	}
}