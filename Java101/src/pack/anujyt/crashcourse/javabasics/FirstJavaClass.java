package pack.anujyt.crashcourse.javabasics;

import java.util.Scanner; // to take input

public class FirstJavaClass {
	// Method:
//	System.out.println();
//	System.out.println("Methods");
	
	// returntype funcName(argumt){}
	int n1, n2;
	static int add(int n1, int n2) {
		System.out.println("Addn: ");
		return n1 + n2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("System.out.println();");
		System.out.println("Hello World"); //sysout ctrl + space
		System.out.println();
		
		// datatypes
			// int,float,double, char, String, long, boolean
		int $x = 1;
		float avgMarks = 19.565f;
		char grade = 'A';
		String name1 = "Java";
		boolean isValid = true;
		long bigNum =  3566789990876556781l;
		System.out.println($x);
		
		// Operators: +, -, /, *, %, ++, --
		int firstNum = 1234;
		int secNum = 123;
		int div = firstNum / secNum;
		System.out.println("div (gives o/p rounded to its floor):"+div); // 10 instead of 10.032....
		// typecasting:
		double div1 = (double) firstNum / (double) secNum;
		System.out.println("div after typecast: "+div1);
	
		double mod = (double) firstNum % (double) secNum;
		System.out.println( "Mod: " + mod);
		
		int a = 12;
		System.out.println(a++);
		System.out.println(" A now : "+a);
		System.out.println();
		System.out.println(++a);
		System.out.println(" A now : "+a);
		
		// similarly for --
		System.out.println(a--);
		System.out.println(" A now : "+a);
		System.out.println(--a);
		System.out.println(" A now : "+a);
		
		// Take Inputs:
		System.out.println();
		System.out.println("Taking inputs");
		
		Scanner sc = new Scanner(System.in); // create obj of scanner class
		
//		System.out.println("Enter your age: ");
//		int age = sc.nextInt();
//		System.out.println(2*age);
		
//		System.out.println("Enter your name: ");
//		String name = sc.nextLine();
//		System.out.println("name is: "+name);
		
		sc.close();
		
		
		// Conditional statements:
		System.out.println();
		System.out.println("if else");
		int age1 = 12;
			// conditional operators: >,<,>=,<=,==,!=
		if(age1 > 18) {
			System.out.println("you can vote");
		} else {
			System.out.println("You cant vote");
		}
		
		boolean isEqul = 18==19;
		System.out.println(isEqul);
		
		
		// if , else if , else block
		System.out.println();
		System.out.println("If else if else : ");
		char grd = 'A';
		if(grd == 'A') {
			System.out.println("Good grade");
		}
		else if(grd == 'B'){
			System.out.println("need improvement");
		}
		else {
			System.out.println("Invalid grade");
		}
		
		// switch case
		System.out.println();
		System.out.println("Switch case; ");
		
		char grde = 'B';
		switch(grde) {
		case 'A':
			System.out.println("Good");
			break;
		case 'B':
			System.out.println("improve");
			break;
		default:
			System.out.println("Invalid");
		}
		
		// logical operators: && , || , !
		System.out.println();
		System.out.println("Logical operator");
		int age2 = 52;
		// conditional operators: >,<,>=,<=,==,!=
		if(age1 > 18 && age2 < 50) {
			System.out.println("you can vote");
		} else {
			System.out.println("You cant vote");
		}
		
		// Loops: 
		// for loop
		System.out.println();
		System.out.println("For loop: ");
		for(int i=0; i<10; i++) {
			System.out.println("Shreyash");
		}
		// for(;;) <--- infinite loop
		
		// while loop
		System.out.println();
		System.out.println("While loop: ");
		int a2 = 3;
		while(a2>0) {
			System.out.println(a2);
			a2--;
		}
		
		// do while loop
		System.out.println();
		System.out.println("Do while: ");
		int a3 = 4;
		do {
			System.out.println("dowhile"+a3);
			a++;
		}while(a3>10);
		
		
		// break , continue
		System.out.println();
		System.out.println("Break continue: ");
		for(int i=0; i<10; i++) {
			if(i==5) continue;
			if(i==9) break;
			System.out.println("Shreyash "+i);
		}
		
		// arrays:
		System.out.println();
		System.out.println("Arrays: ");
		int marks[] = new int[4]; // int[] marks = new int[5];
		marks[0] = 15; // by default it takes 0 for 2&3rd position
		marks[3]= 10;
		for(int i=0; i<marks.length;i++) { // gives indexoutofbound error if access higher index
			System.out.println(marks[i]);
		}
		
		int marks1[] = {20,20,25};
		for(int i=0; i<marks1.length;i++) {
			System.out.println(marks1[i]);
		}
		
		
		// 2d array
		System.out.println();
		System.out.println("2d array: ");
		int a2d[][] = {{1,2},{3,4}};
		System.out.println(a2d[0][1]);
		
		// call method:
		System.out.println(" call method: ");
		System.out.println(add(2,3));
		
		// Exception handling
		System.out.println();
		System.out.println("Exception handling: ");
		int arr1[] = new int[4];
		try {
			System.out.println(arr1[4]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error occured.....");
			System.out.println(e.getMessage());
		}
		System.out.println("this willl print now..");
		
	}
	
}

