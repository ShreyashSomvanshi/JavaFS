package pack.cap.module6.collectn;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {7,3,4,5,6,12,40,5};
		
		Arrays.sort(num);
		System.out.println("Sorted array: " + Arrays.toString(num) );
		// only index of first 5, not second
		int index = Arrays.binarySearch(num, 5);
		System.out.println("Index of : "+index);
	
		int [] num2 = {7,3, 0, 100, 12,40,5};
		boolean check = Arrays.equals(num, num2);
		System.out.println("Are arrays equal?" + check);
		
		int [] copiedArray = Arrays.copyOf(num, num.length);
		System.out.println("Copied Array: "+Arrays.toString(copiedArray));
	
		int [][] multi = {{2,3},{5,6}, {7,8}};
		System.out.println("Multidimensional Array: "+Arrays.deepToString(multi));
	}
}
