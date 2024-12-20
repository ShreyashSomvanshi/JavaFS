package pack.capg.module.collections1;
import java.util.Scanner;
import java.util.ArrayList;

public class TaskArrayList {
	ArrayList<String> empName = new ArrayList<String>();
	
	ArrayList<String> empAddr = new ArrayList<String>();
	
	public void setEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp name: ");
		String name = sc.nextLine();
		System.out.println("Enter emp address: ");
		String addr = sc.nextLine();
		sc.close();
		empName.add(name);
		empAddr.add(addr);
		
	}
	
	public void getEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp id to get details: ");
		int idx = sc.nextInt();
		sc.close();
		System.out.println("Employee details: ");
		System.out.println("Emp name: "+empName.get(idx));
		System.out.println("Emp Addr: "+empAddr.get(idx));
		
	}
	
	public void clearEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp to remove: ");
		int idx = sc.nextInt();
		empName.remove(idx);
		System.out.println("Emps after removing : "+empName);
		sc.close();
	}
	
//	public void addArr() {
//		empName.add(0, null);
//		System.out.println("After adding two arr:", empName.add(empAddr));
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskArrayList emp = new TaskArrayList();
//		emp.setEmp();
		emp.getEmp();
//		System.out.println(empName);
		
		emp.clearEmp();
	}

}
