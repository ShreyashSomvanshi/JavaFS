package pack.cap.module3.ctrlstmnt;

class Car{
	static int carCount = 0;
	public void dispInfo() {
		System.out.println("This is an instance method.");
		
	}
	
	public static void displayCarCount() {
		System.out.println("Total number of cars: "+carCount);
		
	}
	
	public Car() {
		carCount++;
	}
}


public class staticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.dispInfo(); c2.dispInfo();
		//static
		Car.displayCarCount();
		Car.displayCarCount();
		
	}

}
