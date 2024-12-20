package pack.capg.module.collections1;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> city = new LinkedList<String>();
		city.add("Pune");city.add("Patna");
		city.add("Mumbai"); city.add("Bangalore");
		city.remove(2);
		System.out.println(city);
		city.removeFirst();
		System.out.println("Show the name of city @3: "+city.get(1));
	}

}
