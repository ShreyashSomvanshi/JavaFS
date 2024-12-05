package pack.capg.module1.basic;

public class Car {
	String brand = "Mahindra";
	String name = "XUV500";
	int cost = 2000000;
	
	void displayFeatures() {
		System.out.println("The name of car is: "+name+" of brand: "+brand+" and cost is: "+cost);
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.displayFeatures();
		System.out.print(c.name);
	}

}
