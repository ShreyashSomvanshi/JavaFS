package pack.capg.module.collections2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Employee1{
	private int id;
	private String name;
	
	public Employee1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Employee{id = "+id+" ,  name = "+name+"}";
	}
		
	
}

public class ListIteratorDemo {
	public static void printData(List<Employee1> e) {
		System.out.println("\n Current Employee: ");
		for(Employee1 e1: e) {
			System.out.println(e1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1> emp = new ArrayList<>();
		emp.add(new Employee1(101, "John"));
		emp.add(new Employee1(102, "Sam"));
		emp.add(new Employee1(103, "Mark"));
		emp.add(new Employee1(104, "Tim"));
		emp.add(new Employee1(105, "Max"));
	
		//add new employee
		System.out.println("Adding new Employees: ");
		ListIterator<Employee1> litr = emp.listIterator();
		litr.add(new Employee1(106,"Rose"));
		litr.add(new Employee1(107,"Harry"));
		printData(emp);
		
		// Read forward
		System.out.println("Iterating forward: ");
		litr = emp.listIterator();
		while(litr.hasNext()) {
			Employee1 e1 = litr.next();
			System.out.println(e1);
		}
		
		// Update
		System.out.println("Updating employee name (id): ");
		litr = emp.listIterator();
		while(litr.hasNext()) {
			Employee1 e2 = litr.next();
			if(e2.getId() == 103) {
				litr.set(new Employee1(103, "Thomas"));
			}
		}
		printData(emp);
		
		// Delete
		System.out.println("Delete employee name (id 106): ");
		litr = emp.listIterator();
		while(litr.hasNext()) {
			Employee1 e3 = litr.next();
			if(e3.getId() == 106) {
				litr.remove();
			}
		}
		printData(emp);
		
		
		// Read by backward
		System.out.println("Iterating backwards: ");
		litr = emp.listIterator(emp.size()); // resetting to end of list iterator
		while(litr.hasPrevious()) {
			Employee1 e4 = litr.previous();
			System.out.println(e4);
		}
	}
}
