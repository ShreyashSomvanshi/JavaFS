package pack.capg.module.multithreading;

/*
Multithreading: 

Thread class: 
	Constructor: (4)
		Thread()
		Thread(String name)
		Thread(Runnable r)
		Thread(Runnable r, String name)
		
	Methods: 
		currentThread(), sleep(), start(), run(), getName(), setName(), getPriority, isAlive
		join, suspend, resume, isDaemon
		
		
Creating Thread: 

1. By extending java.lang.Thread class
2. By implementing java.lang.Runnable interface

*/

public class MultithreadingDemo extends Thread {
	
	// overriding run method in runnable
	public void run() {
		System.out.println("New Thread running ...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread running ");
		
		MultithreadingDemo t1 = new MultithreadingDemo(); // main thread
		
		// create obj of thread class and pass the obj ref variable t1
		Thread t = new Thread(t1); // child thread
		t.start();
	}

}
