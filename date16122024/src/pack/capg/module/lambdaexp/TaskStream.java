package pack.capg.module.lambdaexp;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import java.util.function.*;
/*
 You are tasked with processing employee salary data using Java 8 Stream operations. 
 The data is provided as an array, and the following operations need to be performed:

Filter Employees: Find the employees whose salary is less than 40000.

Get Employees Earning More Than 75000: Identify the employees whose salary is greater than 75000.

Provide Increment for Employees: Give a 10% salary increment to those employees whose salary is around 35000 (let's assume a range of 33000 to 37000).

Calculate Average Salary: Calculate the average salary of all employees.

Calculate Company Yearly Turnover: Multiply the average salary by the number of employees to estimate the company's yearly turnover.

Arrange Data in Descending Order: Sort the employees' salaries in descending order. 
 */


public class TaskStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] empSal = {25000,42000,30000,50000,35000, 80000, 72000};
		IntStream salaries = Arrays.stream(empSal);
		
		System.out.println("Sal <40k");
		// emp sal<40000
		salaries.filter(sal->sal < 40000).forEach(System.out::println);
		
//		System.out.println("Sal >75k");
//		// emp sal>750000
//		salaries.filter(sal1->sal1 > 75000).forEach(System.out::println);
		
		// increment 10% if sal in range(33k to 37k)
//		Predicate<Integer> isEven = (num)->num%2 == 0;
//		salaries.allMatch(sal->(sal > 30000));
		
		// cal avg sal
		System.out.println();
		double avgSal = salaries.average().getAsDouble();
		System.out.println("Average salary is: "+avgSal);
		
		// cal company turnover
		long total_emp = salaries.count();
		double turnover = avgSal* total_emp;
		System.out.println("Yearly turnover: "+turnover);
		
		// sort in desc order
//		salaries.boxed().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
		
	}

}
