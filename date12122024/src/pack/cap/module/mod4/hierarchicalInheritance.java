package pack.cap.module.mod4;
// e shopping: sellers, customers, admin

class User{
	String name; String email; int userId;

	public User(String name, String email, int userId) {
		super();
		this.name = name;
		this.email = email;
		this.userId = userId;
	}
	public void dispInfo() {
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("UserId: "+userId);
	}
}

class Customer extends User{

	protected Customer(String name, String email, int userId) {
		super(name, email, userId);
		// TODO Auto-generated constructor stub
	}
	
	public void purchaseProduct(String prodName) {
		System.out.println(name + "has purchased " + prodName);
	}
	
}

class Seller extends User{

	public Seller(String name, String email, int userId) {
		super(name, email, userId);
		// TODO Auto-generated constructor stub
	}
	public void addProduct(String prodName, double price) {
		System.out.println(name + " has listed a new product " + prodName + " for $ "+ price);
	}
	
}

class Admin extends User{
	
	
	
	public Admin(String name, String email, int userId) {
		super(name, email, userId);
		// TODO Auto-generated constructor stub
	}

	public void validateProduct(String prodName) {
		System.out.println(name + " has approved the product "+ prodName);
	}
}



public class hierarchicalInheritance {
	
	
	public static void main(String[] args) {
		Customer customer = new Customer("Alice", "alice@gmail.com", 111);
		Seller sell = new Seller("jim", "bob@gmail.com", 112);
		Admin admin = new Admin("Carol", "carol@gmail.com", 113);
	
		customer.dispInfo();
		customer.purchaseProduct("Laptop");
		
		sell.dispInfo();
		sell.addProduct("smartwatch", 2000);
		
		admin.dispInfo();
		admin.validateProduct("smartwatch");
	}
}
