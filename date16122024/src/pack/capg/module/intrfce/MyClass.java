package pack.capg.module.intrfce;

public class MyClass implements MyFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m1 = new MyClass();
		m1.apply();
		m1.show();
		m1.defaultMethod();
		MyFunctionalInterface.staticMethod();
	}

	@Override
	public void apply() {
		// TODO Auto-generated method stub
		System.out.println("Applying");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing");
	}

}
