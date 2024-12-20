package pack.capg.module.collections1;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Mango");a1.add("Apple");a1.add("Papaya");a1.add("Banana");
		System.out.println(a1);
	
		System.out.println("Remove element: " + a1.remove(2));
		System.out.println("After removing: " + a1 );
		System.out.println("Set new element: " + a1.set(2,  null));
		System.out.println("After setting a new element: "+a1);
//		System.out.println("Get the element which is at index 3: "+a1.get(3)); // index out of bound err
		System.out.println("Size of the arraylist: "+a1.size());
		System.out.println("Apple is in my list or not?" + a1.contains("Apple"));
		
		System.out.println("Increase arraylist capacity manualy: ");
		a1.ensureCapacity(20);
		System.out.println("Size of the arraylist: "+a1.size());
		a1.trimToSize();
	}

}
