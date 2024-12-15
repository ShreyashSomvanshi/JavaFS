package pack.cap.module6.collectn;

import java.util.Scanner;


public class Array_Example{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of subjects: ");
		int n = sc.nextInt();
		
		int[] marks = new int[n];
		System.out.println("Enter the marks obtained in subjects: ");
		
		for(int i = 0; i<n; i++) {
			marks[i] = sc.nextInt();
		}
		
		int totalmarks = 0;
		for(int i = 0; i<n; i++) {
			totalmarks += marks[i];
		}
		
		float percentage = totalmarks/n;
		
		System.out.println("Total marks: "+totalmarks);
		System.out.println("Percentage: "+percentage+"%");
	}
}



