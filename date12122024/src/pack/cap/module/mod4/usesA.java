package pack.cap.module.mod4;
// types of relationship among classes
// Dependence (Uses-A)
// Association (Has-A)
// Inheritance(Is-A)


class Product{
	String productName; double price;
	
	public Product(String productName, double price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	public void dispProduct() {
		System.out.println("Product name: "+productName);
		System.out.println("Price: "+price);
	}
}

class Customer1{
	String name;
	int customerId;
	public Customer1(String name, int customerId) {
		super();
		this.name=name;
		this.customerId = customerId;
	}
	// method where customer 'Uses-A' product as(dependent class)
	public void purchaseProduct(Product pro) {
		System.out.println(name+" ispurchasing the folllowing product: ");
		pro.dispProduct();
		System.out.println(name+" has successfully purchased "+pro.productName);
	}
}

public class usesA {

	public static void main(String[] args) {
		// instance of product
		Product laptop = new Product("Laptop",90000.0);
		Product phone = new Product("Smartphone", 40000.99);
		
		// create instance of customer
		Customer1 cust = new Customer1("Dona", 111);
		cust.purchaseProduct(laptop);
		cust.purchaseProduct(phone);
	}

}
