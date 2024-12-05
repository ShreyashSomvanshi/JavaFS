package pack.capg.module1.basic;

/*Class variable (static variable)
 * 
 * it is always declared with static keyword and shared by all the instances of class.
 * scope - accessible to all its, methods, constructors, block
 * - can be accessed without object
 * lifetime - tied to the lifetime of class
 * 
 * 
 * */

public class staticVariable {
	
	// class variable or static variable
	static int count = 0;
	void increment() {
		count++;
	}
	
	public static void main(String[] args) {
		staticVariable S1 = new staticVariable();
		staticVariable S2 = new staticVariable();
		S1.increment();
		S2.increment();
		System.out.println("Total count: "+staticVariable.count);
	}

}
