package pack.cap.module4.accessMod;
/*
 * types: Non Static Nested class, static nested class, local class, anonymous class
 * */

// non static nested class or inner class 

// anonymous class
interface Greet{
	void sayHello();
}

class Outer {
	private int outervalue = 100;
	private static int staticvalue=20;
	// non static inner class
	class Inner{
		void disp() {
			System.out.println("Outer class value: "+outervalue);
		}
	}
	
	void createInner() {
		Inner in = new Inner();
		in.disp();
	}
	
//	static inner class
	static class StaticNested{
		void display() {
			System.out.println("Static value from outer class: "+staticvalue);
		}
	}
	
	// outer class method
	void outerMethod() {
		int local_var = 200;
		// local class
		class Local{
			void dispLocal() {
				System.out.println("Inside loocal class.");
			}
		}
		Local l1 = new Local();
		l1.dispLocal();
	}
}

public class OuterClassDemo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		out.createInner();
		Outer.StaticNested nested = new Outer.StaticNested();
		nested.display();
		out.outerMethod();
		
		
	}

}
