package pack.cap.module6.collectn;

import java.util.Scanner;


public class OneDArrDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of Employees: ");
		int n = sc.nextInt();
		
		double[] salary = new double[n];
		
		
		for(int i = 0; i<n; i++) {
			System.out.println("Enter the salay for employee"+(i+1)+": " );
			salary[i] = sc.nextInt();
			double sal = salary[i];
			
			if(sal>30000) {
				salary[i] += sal * 0.1;
				double hra = salary[i]*0.1;
				double da = salary[i]*0.05;
				double ta = salary[i]*0.08;
				double total = sal+hra+da+ta;
				System.out.println("Total Salary of Employee"+(i+1)+" after allowances : "+total);
				System.out.println();
			}
			
			if(sal == 20000) {
				salary[i] += 2000;
				double hra = salary[i]*0.1;
				double da = salary[i]*0.05;
				double ta = salary[i]*0.08;
				double total = sal+hra+da+ta;
				System.out.println("Total Salary of Employee"+(i+1)+" after allowances : "+total);
				System.out.println();
			}
			
			if(sal <= 15000) {
				System.out.println("Improve work to get more salary.");
				double hra = salary[i]*0.1;
				double da = salary[i]*0.05;
				double ta = salary[i]*0.08;
				double total = sal+hra+da+ta;
				System.out.println("Total Salary of Employee"+(i+1)+" after allowances : "+total);
				System.out.println();
			}
		}
		
		sc.close();
	}

}
