package pack.anujyt.crashcourse.javaOOP;

import encap.encapsulation_demo;

// Object class is parent of all classes/objects


public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		// creating object
		Person p1 = new Person();
		p1.age = 24;
		p1.name = "Shrr";
		System.out.println(p1.age+" "+p1.name);
		
		Person p2 = new Person();
		p2.age = 14;
		p2.name = "Sr";
		System.out.println(p2.age+" "+p2.name);
		
		// accessing properties
		p1.eat();p1.walk();
		p2.walk(22);
		
		Person p3 = new Person(33, "SSS");
		System.out.println(p3.age+" "+p3.name);
		
		Developer d1 = new Developer(22, "SSSSSSSSSSS");
		System.out.println(d1.age+" "+d1.name);
		d1.walk();d1.work();
	
		
		// Accessing methods ffrom other class in other package
		encapsulation_demo ob = new encapsulation_demo();
		ob.doWork();
//		ob.pvtWork();
	}

}

class Person{
	String name;
	int age;
	static int count = 0;
	
	// constructor
	public Person() {
		count++;
		System.out.println("Object crreated");
		System.out.println("Count: "+count);
	}
	
	public Person(int newAge, String name) {
		this.name = name;
		this.age = newAge;
	}
	
	void walk(){
		System.out.println(name + " is walking.." );
	}
	
	void eat(){
		System.out.println(name + " is eating.." );
	}
	
	// polymorphism
	void walk(int steps) {
		System.out.println(name + " has walked "+steps+" steps..");
	}
	
	void work() {
		System.out.println("Person in working....");
	}
	
}

// Inheritance:

class Developer extends Person{
	public Developer(int age, String name) {
		super(age, name);
	}
	
	void walk(){
		System.out.println("Developer " + name + " is walking.." );
	}
}



