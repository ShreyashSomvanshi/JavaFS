package pack.capg.module1.basic;

public class shiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=15;
		System.out.print(x>>>2);
		
		int hours = 5;
		int doubledHours = hours << 1;
		int halvedHours = hours >> 1;
		int negativenum = -16;
		int unsigndShift = negativenum >>> 2;
		System.out.print(unsigndShift);
	}

}
