package pack.cap.module3.ctrlstmnt;

public class CallByValue {
	
	int change(int b) {
		++b; // change will be in the local variable only
		return b;
	}
	
	int x=20;
	
//	int demo() {
//		
//	}
	
	void modify(int x) {
		x=x+300;
		System.out.println("Value of x after modification: "+x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValue c1 = new CallByValue();
		c1.modify(c1.x); //calling method
		System.out.println("Original value of x: "+c1.x);
		
		
		int a = 20; 
		int x = c1.change(a); // passing value to the called method
		System.out.println("Value of a after passing: "+a);
		System.out.println("Value of x after modifying: "+x);
	}

}
