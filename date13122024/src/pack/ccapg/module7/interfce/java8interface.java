package pack.ccapg.module7.interfce;

public interface java8interface {
	
//	java8 allows default interface
	
	// abstract method
	void calculate(int x, int y, int z);
	
	// java 8 --> default method
	default void call() {
		System.out.println("This is a default method.");
	}
	
	// java 8 --> static method
	static void pay() {
		System.out.println("This is static method.");
	}
	
	
}
