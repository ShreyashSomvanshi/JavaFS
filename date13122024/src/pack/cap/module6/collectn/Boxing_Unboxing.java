package pack.cap.module6.collectn;

import java.util.ArrayList;

public class Boxing_Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// autoboxing
		list.add(5);
		list.add(6);
		System.out.println(list);
		
		// unboxing
		int a = list.get(0);
		System.out.println(a);
		
		
		// wrappeer classes
		//math class
		int x = 20;
		int y = -20;
		double p = -27.43, q = -777.37;
		
		System.out.println(Math.abs(x));
		System.out.println(Math.abs(y));
		System.out.println(Math.abs(p));
		System.out.println(Math.abs(q));
		System.out.println(Math.max(x, y));
		System.out.println(Math.min(x,y));
		System.out.println("Round up: " + Math.round(q));
		String str = Integer.toBinaryString(x);
		System.out.println(str);
		
		Integer i1 = new Integer(x);
		int hash = i1.hashCode();
		System.out.println("Hash code: " + hash);
		System.out.println("Bitcount: " + Integer.bitCount(x));
		System.out.println("Reverse BIt: " + Integer.reverse(x));
	}

}
