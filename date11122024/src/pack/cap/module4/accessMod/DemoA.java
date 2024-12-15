package pack.cap.module4.accessMod;

public class DemoA {
	private int data = 50;
	String name; int age;
	
	private DemoA(int data, String name, int age) {
		super();
		this.data = data;
		this.name = name;
		this.age = age;
	}
	
	private void call() {
		System.out.println("Hello access modifiers!");
		System.out.println("Name: "+name);
		System.out.println("data:" +data);
		System.out.println("age:" +age);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	DemoA a1 = new DemoA(200, "pvt mod", 20);
	a1.call();
	}

}
