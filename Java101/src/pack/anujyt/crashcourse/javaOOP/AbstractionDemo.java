package pack.anujyt.crashcourse.javaOOP;

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a1 = new Audi();
		a1.start();
	}

}

class Audi extends Car{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Audi is starting");
	}
	
}

class BMW extends Car{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW is starting");
	}
	
}


abstract class Car{
	
	int price;
	
	abstract void start() ;
//	{
//		System.out.println("Car is strating");
//	}
}

