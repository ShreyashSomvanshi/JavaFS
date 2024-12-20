package pack.capg.module.intrfce;

//@FunctionalInterface

public interface MyFunctionalInterface {

	void apply();
	void show();
	
	//default method
	default void defaultMethod() {
		System.out.println("Default method ");
	}
	
	static void staticMethod() {
		System.out.println("this is static method..");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// cannot create its object
//		MyFunctionalInterface f1 = new MyFunctionalInterface();
	}

}
