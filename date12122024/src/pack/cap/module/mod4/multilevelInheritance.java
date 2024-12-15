package pack.cap.module.mod4;

class vehicle{
	String manYear;
	int modelNum;
	String engineType;
	
	protected vehicle(String manYear, int modelNum, String engineType) {
		super();
		this.manYear = manYear;
		this.modelNum = modelNum;
		this.engineType = engineType;
	}
	

	public static void fuel() {
		System.out.println("refuelling vehicle....");
}
}


class bike extends vehicle{
	String name;
	String type;
	protected bike(String manYear, int modelNum, String engineType, String name, String type) {
		super(manYear, modelNum, engineType);
		this.name = name;
		this.type = type;
	}
	
	void display() {
		System.out.println("Bike  name:"+name+" Manufacturing year:"+manYear+" engine type: "+engineType+" bike type: "+type);
	}
}

class car extends vehicle{
	String name;
	String type;
	protected car(String manYear, int modelNum, String engineType, String name, String type) {
		super(manYear, modelNum, engineType);
		this.name = name;
		this.type = type;
	}
	void display() {
		System.out.println("Car  name:"+name+" Manufacturing year:"+manYear+" engine type: "+engineType+" car type: "+type);
	}
	
}


class electric extends car{
	String charging;
	protected electric(String manYear, int modelNum, String engineType, String name, String type, String charging) {
		super(manYear, modelNum, engineType, name, type);
		this.name = name;
		this.charging = charging;
	}
	void displayCharging() {
		System.out.println("Charged: "+charging);
	}
}

class racer extends bike{
	int maxspeed;
	protected racer(String manYear, int modelNum, String engineType, String name, String type, int maxspeed) {
		super(manYear, modelNum, engineType, name, type);
		this.name = name;
		this.maxspeed = maxspeed;
	}
	void speed() {
		System.out.println("Speed: "+maxspeed);
	}
}


public class multilevelInheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		car c1 = new car("2023", 1122, "diesel", "thar", "sedan");
//		c1.display();
//		
//		bike b1 = new bike("2022", 2211, "petrol", "radeon", "offroading");
//		b1.display();
//		b1.fuel();
		
		racer b2 = new racer("2025", 3333, "petrol", "Zx10r", "racer", 300);
		b2.display();
		b2.speed();
	}

}
