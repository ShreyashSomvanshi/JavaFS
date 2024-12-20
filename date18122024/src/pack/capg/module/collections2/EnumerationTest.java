package pack.capg.module.collections2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		Enumeration e = v.elements();
		Iterator itr = v.iterator(); // itr is the inner class present nside the vector which implements the iterator interface
		ListIterator litr = v.listIterator(); // litr is the inner class present nside the vector which implements the iterator interface
		
		
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(litr.getClass().getName());
	}

}
