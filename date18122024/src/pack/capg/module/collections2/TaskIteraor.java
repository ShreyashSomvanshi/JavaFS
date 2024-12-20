package pack.capg.module.collections2;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskIteraor {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("abc");
		arr.add("xyz");
		arr.add("xyz");
		arr.add("jkl");
		
		System.out.println(arr);
		
		Iterator<String> itr = arr.iterator();
		while(itr.hasNext()) {
				String i = itr.next();
				System.out.println(i);
			}
		
		Iterator<String> itr1 = arr.iterator();
		while(itr1.hasNext()) {
			String i = itr1.next();
			// removing 
			if(i == "xyz") {
				itr1.remove();
			}
//			System.out.println(arr);
		}
		
		System.out.println(arr);
	}

}
