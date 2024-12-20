package pack.capg.module.collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student2{
	int rollno;
	String name;
	int age;
	public Student2(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student2 [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}

class AgeComparator implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
		if(o1.age == o2.age) {
			return 0;
		}
		else if(o1.age>o2.age){
			return 1;
		}else {
			return -1;
		}
		
	}
	
}

class NameComparator implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
		if(o1.name == o2.name) {
			return 0;
		}
		else {
			return -1;
		}
		
	}
	
}

public class comparator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student2> stud = new ArrayList<Student2>();
		stud.add(new Student2(101, "Shr", 21));
		stud.add(new Student2(102, "Abhi", 23));
		stud.add(new Student2(103, "Xyz", 21));
		
		Collections.sort(stud, new AgeComparator());
		System.out.println();
		
		Iterator<Student2> itr = stud.iterator();
		while(itr.hasNext()) {
			System.out.println();
		}
		
		
	}

}
