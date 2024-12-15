package pack.cap.module.mod4;


/*
 * superclass -------> subclass object
 * Superclass sc = new SubClass();
 * 
 * subclass ref --------> superclass object
 * Subclass obj = new SuperClass();
 * */
class Animal{
	public void makeSound() {
		System.out.println("Animal makes a sound....");
	}
}

class Dog extends Animal{
	public void makeSound() {
		System.out.println("Dog Barks");
	}
	public void fetch() {
		System.out.println("Dog is fetching the ball...");
	}
}




public class UpcastingDowncasting {

	public static void main(String[] args) {
		// Upcasting
//		// Dog object
		Dog dog = new Dog();
//		// upcasting: assigning dog obj to animal ref
		Animal ani = dog; // implict upcasting
		ani.makeSound(); // call dog makeSound() because of dynamic method dispatch
//		ani.fetch();// compile time error: fetch is not the method of animal class
		
		// Downcasting
		Animal animal = new Dog();
		Dog dog1 = (Dog)animal; // explicit downcasting
		dog1.makeSound();
		dog1.fetch();
	}

}
