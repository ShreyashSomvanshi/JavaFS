package pack.cap.module6.collectn;

import java.util.Arrays;

class Employee{
	int EmpId;
	String EmpName;
	double salary;
	
	public Employee(int EmpId, String EmpName, double salary) {
		super();
		this.EmpId = EmpId;
		this.EmpName = EmpName;
		this.salary = salary;
	}
	
	public void dispInfo() {
		System.out.println("Employee ID: "+EmpId+ " Emp Name:" + EmpName+" Salary: "+salary);
	}
}

// To Apply: Arrays.equals ; Arrays.sort ; Arrays.fill ; Arrays.copyOf

public class taskArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emp = new Employee[3];
		
		emp[0] = new Employee(101,"Abhi", 33000);
		emp[1] = new Employee(102,"Shreyas", 28000);
		emp[2] = new Employee(103, "Adi", 26000);
		
		System.out.println("Employee Details ");
		for(int i=0; i<emp.length; i++) {
			emp[i].dispInfo();
		}
		
		System.out.println();
		System.out.println("Copied Array: ");
        Employee[] empCopy = Arrays.copyOf(emp, 2); // copyOf(emp, emp.length);
        for (Employee employee : empCopy) {
            employee.dispInfo();
        }
        
        System.out.println();
        System.out.println("Array.fill for updaing salary, name of second emp: ");
        Arrays.fill(emp, 1, 2, new Employee(222, "Neweemmpp", 999));
        for (Employee employee : emp) {
            employee.dispInfo();
        }
        System.out.println();
        
//        Arrays.sort(emp, (a,b)->Double.compare(a.salary, b.salary));
        System.out.println();
        System.out.println("Emp sorted by salary: ");
        Arrays.sort(emp, (a,b)->Double.compare(a.salary, b.salary));
        for (Employee employee : emp) {
            employee.dispInfo();
        }
        System.out.println();
        
        
        System.out.println("Equals: "+Arrays.equals(emp, empCopy));
        
	}

}




