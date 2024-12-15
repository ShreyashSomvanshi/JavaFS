package pack.cap.module3.ctrlstmnt;


/*
 * Modifier return-type method-name parameter list(method-body)
 * predefined methods
 * user defined methods --> instance methods, static methods.
 * */


public class methodDemo {
	String Brand; String model; int year;
	
	public methodDemo(String brand, String model, int year) {
		super();
		Brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public void DispInfo() {
		System.out.println("Car brand: "+Brand);
		System.out.println("Car model: "+model);
		System.out.println("Car year: "+year);
	}
	
	public void startCar() {
		System.out.println(Brand+" "+model+" is starting.");
	}
	
	public void stopCar() {
		System.out.println(Brand+" "+model+" is stopping.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodDemo car1 = new methodDemo("Toyota", "Corolla", 2023);
		methodDemo car2 = new methodDemo("Honda", "City", 2022);
		
		car1.DispInfo(); car2.DispInfo();
		car1.startCar(); car2.startCar();
		car1.stopCar(); car2.stopCar();
		
		
	}

}
