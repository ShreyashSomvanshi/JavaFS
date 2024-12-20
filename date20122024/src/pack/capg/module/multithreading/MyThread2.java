package pack.capg.module.multithreading;

public class MyThread2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread running....");
		MyThread2 th2 = new MyThread2();
		Thread t = new Thread(th2);
		t.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("New child thread running ..... ");
		for(int i=0; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println(Thread.currentThread());
	}

}
