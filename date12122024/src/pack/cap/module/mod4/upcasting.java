package pack.cap.module.mod4;

class A{
	public void m1() {
		System.out.println("A Method m1");
	}
}

class B extends A{
	public void m1() {
		System.out.println("B method m2");
	}
}


class C extends B{
	public void m1() {
		System.out.println("C method m3");
	}
}

public class upcasting {

	public static void main(String[] args) {
//		
//		A a = b;
//		a.m1();
		A a = new A();
		a.m1();
		
		B b = new B();
		b.m1();
//		b.m2();
//		a.m2();
		
		C c = new C();
		c.m1();
		
		A a2;
		a2 = b;
		a2.m1();
	}

}
