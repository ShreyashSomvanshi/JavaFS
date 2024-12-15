package pack.cap.module2.oop;
// one to one association

class Passport{
	private String passportNumber;
	
	public String getPassportNumber() {
		return passportNumber;
	}
}


class Person{
	private String name;
	private Passport pp; // one to one associ
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Passport Number: "+pp.getPassportNumber());
	}
	
}


public class Main {
	public static void main(String[] args) {
		Passport p1 = new Passport("A12346HJ");
		Person p2 = new Person("Mike", p1);
		p2.displayInfo();
	}
}
