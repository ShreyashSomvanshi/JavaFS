package pack.cap.module6.collectn;

/*
 * Declare it, instantiate the object, Access and use the object 
 */

class Student{
	String name;
	int age;
	
	public Student(String name, int age) {
		super();
		this.name=name;
		this.age = age;
	}
	
	public void dispInfo() {
		System.out.println("Name: "+name+" age: "+age);
	}
}

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stu = new Student[3];
		
		stu[0] = new Student("John", 23);
		stu[1] = new Student("Maria", 25);
		stu[2] = new Student("Sam", 26);
	
		System.out.println("Student Details ");
		for(int i=0; i<stu.length; i++) {
			stu[i].dispInfo();
		}
	}

}
