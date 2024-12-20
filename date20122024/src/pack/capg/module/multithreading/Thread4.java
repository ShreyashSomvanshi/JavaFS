package pack.capg.module.multithreading;

public class Thread4 extends Thread{
	String task;
	
	public Thread4(String task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i=0; i<=5; i++) {
			System.out.println(task+ " : " +i);
//			System.out.println("task: "+i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println("error");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread4 t1 = new Thread4("cut the ticket");
		Thread4 t2 = new Thread4("show your seat no. ");
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();
		
	}

}
