package pack.capg.module.collections2;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		int size = lhs.size();
		System.out.println("Size="+size);
		
		lhs.add("WHite"); lhs.add("Black");lhs.add("Green"); lhs.add("Pink");
		
		int size1 = lhs.size(); System.out.println("Size1= "+size1);
		
		// add duplicate
		lhs.add("Black");
		
		LinkedHashSet<String> lhs2 = new LinkedHashSet<String>();
		lhs2.add("Brown"); lhs2.add(null);
		lhs.addAll(lhs2);
		System.out.println("Elements after adding lhs2 in lhs: "+lhs);
		
		lhs.removeAll(lhs2);
		System.out.println("After removing all lhs2 from lhs: "+lhs);
		int[] num = {5,5,1,2,34,45,34,89,45,23,3,90,21,2,1};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		
	}

}
