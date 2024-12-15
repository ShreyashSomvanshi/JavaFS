package pack.capg.module1.basic;

public class Student {
	// variables
	byte num = 127;
	int rollno;
	String name = "java";
	
	// methods
	void display() {
		System.out.println("name:"+name);
		System.out.println("roll no:"+rollno);
		System.out.println("num:"+num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num1=220;
		int lightspeed= 186282;
		
		
		float f = 10.2f; // default: 0.0f
		double d = 1234.56; // default: 0.0d
		
		double pi, r;
		r= 5.5;
		pi = 3.1416;
		double area = pi* r* r;
		System.out.println("Area of circle: "+area);
		
		
		long days = 1000;
		long second = days*24*60*60;
		long distance = lightspeed * second;
		
		char b = 55;
		char a = 'a'; // default = \u0000
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		
		System.out.println("float is:" + f);
		System.out.println("In 100 days distance travelled by light is: "+distance+" miles.");
		// initializing object with constructor
		Student s1 = new Student();
		s1.display();
	}

}
