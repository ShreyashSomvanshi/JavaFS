package pack.capg.module1.basic;

public class localVariable {

	/*
	 * Local variable - method, constructor, block
	 * Scope- block scoped limited to block in which it is declared
	 * lifetime- till the method or block is executing, destroyed once the execution is finished
	 * 
	 * */
	
	String model; int year;
	void displayinfo() {
		System.out.println("model: "+model);
		System.out.println("year: "+year);
	}
	
//	System.out.println("Local variable: "+localVar);
	
	public static void main(String[] args) {
		
	}

}
