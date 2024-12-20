package pack.capg.module.multithreading;

public class Thread3 implements Runnable {

	

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		System.out.println("thread3 running");
		
		add();
		subtract();
		mul();
		
	}
	
	int a = 10;
	int b = 20;
	public void add() {
		int sum = a+b;
		System.out.println("Addition: "+sum);
	}
	
	public void subtract() {
		int sub = a-b;
		System.out.println("Subtarction: "+sub);
	}
	
	public void mul() {
		int mul = a*b;
		System.out.println("Multiplication: "+mul);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread running");
		Thread3 t3 = new Thread3();
		Thread t = new Thread(t3);
		
		t.start();
	}
}
