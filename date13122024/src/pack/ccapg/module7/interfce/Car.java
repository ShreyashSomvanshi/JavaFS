package pack.ccapg.module7.interfce;

public class Car implements vehicle{
	String color;
	@Override
	public void start() {
		System.out.println("starting engine");
	}
	
	@Override
	public void stop() {
		System.out.println("stopping engine");
	}
	
	String carColor(String color) {
		return color;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.start();
		c.stop();
		c.carColor("red");
	}

}
