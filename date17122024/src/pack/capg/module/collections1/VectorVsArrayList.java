package pack.capg.module.collections1;

import java.util.ArrayList;
import java.util.Vector;

public class VectorVsArrayList {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		ArrayList<String> a1 = new ArrayList<String>();
		
		System.out.println("Adding Element to Vector and ArrayList");
		v.add("Apple");
		v.add("Banana");
		v.add("Cherrry");
		a1.add("Apple");
		a1.add("Banana");
		a1.add("Cherrry");
		System.out.println("Vector contents: "+v);
		System.out.println("ArrayList contents: "+a1);
	
		System.out.println("Remove banana from vector and arraylist");
		v.remove("Banana");
		a1.remove("Banana");
		
		System.out.println("Vector contents after removal "+v);
		System.out.println("ArrayList contents after removal "+a1);
		
		//add more element to exceed initial capacity 

	       // display updated content
		
	       // show size and capacity 

	       //perform the random access
		
	       //display updated collection
		
	}

}
