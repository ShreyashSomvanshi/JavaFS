package pack.cap.module.mod4;

// superclass
class Employee{
	String name;
	int employeeId;
	double salary;
	
	protected Employee(String name, int employeeId, double salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	
	public void work() {
		System.out.println(name + " is working as employee");
	}
	
	public void getSalary() {
		System.out.println(name + " is getting "+salary+ "as a normal employee.");
		
	}
}

// subclass
class Manager extends Employee{
	String team;
	
	protected Manager(String name, int employeeId, double salary, String team) {
		super(name, employeeId, salary);
		this.team = team;
//		this.salary = salary;/// this works for current object
	}
	
	public void manageTeam() {
		System.out.println(name + " is managinig as manager for the "+team);
	}
	
//	public void getSalary() {
//		System.out.println(name + " is getting "+salary+ "as a manager.");
//		
//	}
}

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager("hsr", 202, 30000.0, "Dev team");
		m.work();
		m.getSalary();
		m.manageTeam();
	}

}
