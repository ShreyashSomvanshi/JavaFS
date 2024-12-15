package pack.cap.module3.ctrlstmnt;

import java.util.*;
import java.util.Scanner;

public class NestedIfElse {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of copies to be printed: ");
		int noOfCopies = sc.nextInt();
		
		if(noOfCopies > 0 && noOfCopies < 100) {
			double pricePerCopies = 0.30;
			System.out.println("Price per copy: "+ "pricePerCopies");
			double totalcost = noOfCopies * pricePerCopies;
			System.out.println("Total cost is: "+totalcost);
		}
	}
}
