package pack.capg.module.collections2;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetDemo {

	public static void display(SortedSet<Student> students) {
		for(Student s : students) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Student> students = new TreeSet<Student>();
		students.add(new Student(101, "Alice","Maths"));
		students.add(new Student(102, "Charlie","Physics"));
		students.add(new Student(109, "David","Chemistry"));
		students.add(new Student(107, "Aril","Biology"));
		students.add(new Student(104, "Eva","Comp Sci"));
		students.add(new Student(103, "Xyz","subj"));
	
		// display
		System.out.println("Registered Student : ");
		display(students);
		
		// remove
		System.out.println("Remove the student by id(102): ");
		students.remove(new Student(102, "Charlie", "Physics"));
		display(students);
		
		// get first entry and last entry details
		System.out.println("\n First student registered: "+students.first());
		System.out.println("\n Last student registered: "+students.last());
		
		// subset
		System.out.println("\n Student with Id's between 101 & 107");
		SortedSet<Student> subset = students.subSet(new Student(101, "",""), new Student(107,"",""));
		display(subset);
		
		System.out.println("\n Student with IDs greater than 103");
		SortedSet<Student> highStu = students.tailSet(new Student(103,"",""));
		display(highStu);
	
		System.out.println("Navigable set method: ");
		// navigable method
		NavigableSet<Student> stu = new TreeSet<Student>();
		stu.add(new Student(109, "David","Chemistry"));
		stu.add(new Student(107, "Aril","Biology"));
		stu.add(new Student(104, "Eva","Comp Sci"));
		stu.add(new Student(103, "Xyz","subj"));
		
		System.out.println("\n Student in the list >= 102 " + stu.higher(new Student(102,"","")));
		System.out.println("\n Student in the list < id 105 " + stu.lower(new Student(105,"","")));
		
		System.out.println("\n reverser order of stdudents: ");
		NavigableSet<Student> stuRev = stu.descendingSet();
		
		display(stuRev);
		
		System.out.println("Tailset of navigableset: ");
		// inclusive of 104
		NavigableSet<Student> set = stu.tailSet(new Student(104,"",""), true); 
		display(set);
	}

}
