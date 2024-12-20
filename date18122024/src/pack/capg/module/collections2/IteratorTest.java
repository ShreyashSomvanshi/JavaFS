package pack.capg.module.collections2;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * types of Iterator:
 * Enumeration
 * Iterator/cursor
 * ListIterator
 * SplitIterator (newly added) 
 */

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for(int i=0; i<=8; i++) {
			a1.add(i);
		}
		System.out.println(a1);
		
		// Declare iterator
		Iterator<Integer> itr = a1.iterator();
		
		// checking next element
		while(itr.hasNext()) {
		//	moving cursor to next element using ref variable itr
			Integer i = itr.next();
			System.out.println(i);
			
			// remove
			if(i%2 == 0) {
				itr.remove();
			}
			System.out.println(a1);
		}
		
	}

}
