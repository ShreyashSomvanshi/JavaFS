package pack.cap.module.mod4;

class Number{
	int x = 20;
	void display() {
		System.out.println("x= "+x);
	}
}

class Number2 extends Number{
	int x = 50;
	void display() {
		System.out.println("x= "+x);
	}
}


public class singleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number2 n1 = new Number2();
		n1.display();
	}

}
