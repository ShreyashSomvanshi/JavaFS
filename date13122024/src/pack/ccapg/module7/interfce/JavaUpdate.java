package pack.ccapg.module7.interfce;

public class JavaUpdate implements java8interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaUpdate java = new JavaUpdate();
		java.calculate(2, 2, 0);
		java.call(); //default
		java8interface.pay(); //static - cant be override by classes
	}
	
	@Override
	public void calculate(int x, int y, int z) {
		z = (x*x) + (y*y) + (2*x*y);
		System.out.println(z);
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		java8interface.super.call();
		System.out.println("Update something on default ");
	}
	
	
}




