package pack.capg.module1.basic;

/*  You are building a system for a retail store that needs to calculate the
 *  total price of several items. The items come in different sizes and quantities, 
 *  so you need to handle various types of numeric data to store item prices, 
 *  quantities, and the total amount for a transaction. Some numbers (like item price)
 *  are small and can fit into a byte or short, while others (like total price) might 
 *  require larger numbers, so they would need to be handled by int or long.
    You also need to calculate and display the total price with decimals 
    (e.g., sales tax, discounts), which requires floating-point types (float or double).
 */




public class RetailStore {
	int quantity;
	String name;
    double price;
//    byte discount;
    static double totalPrice = 0;
//  Constructor 
    public RetailStore(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalPrice += this.price * this.quantity;
    }
    
    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity in Stock: " + quantity);
        System.out.println("==================");
        
    }


	public static void main(String[] args) {
		
		// Create Product objects
        RetailStore p1 = new RetailStore("Laptop", 36500.98989, 30);
        RetailStore p2 = new RetailStore("Smartphone", 20000.067670, 25);

        // Display details of each product
        p1.displayDetails();
        p2.displayDetails();
        
        // Calculate and display total value of each product in stock
        System.out.println("Total value of " + p1.name + " in stock: " + p1.quantity * p1.price);
        System.out.println("Total value of " + p2.name + " in stock: " + p2.quantity * p2.price);
        System.out.println("Total value of all products in retail store is:  " + totalPrice);
	}

}

