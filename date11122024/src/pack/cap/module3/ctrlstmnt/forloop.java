package pack.cap.module3.ctrlstmnt;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5, factorial = 1;
		for(int i=1; i<=10; i++) {
			System.out.println(i+" ");
		}
		for(int i=1; i<number; i++) {
			factorial *= i;
		}
		System.out.println("Factorial of "+ number +"is : "+factorial);
	
//		No stopping condition (infinite loop)
//		for(;;) {
//			System.out.println(number);
//			number++;
//		}
		
		int a, b;
		for(a=1, b=5; a<=5; a++, b--) {
			System.out.println(a+" \t"+b);
		}
		
		for(a=1; b<=20 && b<20; b++) {
			b=b+a;
		}
		System.out.println("Sum = "+b);
	}
	
	
	/*
	 * ForEach loop
	 * for(data-type identifier : expression)
	 * {
	 * 		loop body
	 * }
	 * */

}
