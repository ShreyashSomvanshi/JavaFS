package pack.capg.module1.basic;

public class Demo1 {
	
	/*
	 * Local variable - method, constructor, block
	 * Scope- block scoped limited to block in which it is declared
	 * lifetime- till the method or block is executing, destroyed once the execution is finished
	 * 
	 * */
	
	
	/*
	 * Instance variable- declared within a class but outside any method, constructor or block
	 *  also called as non-static variable
	 * - used to declare instances
	 * - every object has its own copy of instance variable
	 * 	scope - accessible by all methods, constructors, blocks
	 * lifetime - it is tied to lifetime of object they belong to. 
	 * */
	
	/*Class variable (static variable)
	 * 
	 * it is always declared with static keyword and shared by all the instances of class.
	 * scope - accessible to all its, methods, constructors, block
	 * - can be accessed without object
	 * lifetime - tied to the lifetime of class
	 * 
	 * 
	 * */
	// instance variable
	int instanceVar = 10;
	
	// class variable
	static int classVar = 20;

	void display() {
		// local variable
		int localVar = 30;
		System.out.println("Instance variable = "+instanceVar);
		System.out.println("Local Variable = "+localVar);
		System.out.println("Static Variable = "+classVar);
	}

	public static void main(String[] args) {
		System.out.println("Class variable or satic variable => "+classVar);
		Demo1 d1 = new Demo1();
		System.out.println("Instance variable => "+d1.instanceVar);
		d1.display();
	}

}
