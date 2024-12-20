package pack.capg.module.collections2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, String> hmap = new HashMap<>();
		hmap.put('V', "Violet");
		hmap.put('I', "Indigo");
		hmap.put('B', "Blue");
		hmap.put('G', "Green");
	
		Iterator<Entry<Character, String>> itr = hmap.entrySet().iterator();
		System.out.println("Iterating entries of Hashmap");
		
		while(itr.hasNext()) {
			Object key = itr.next();
			System.out.println(key);
		}
		
		//iterating over hashmap keys
		Iterator<Character> itr2 = hmap.keySet().iterator();
		System.out.println("Iterating over keys");
		while(itr2.hasNext()) {
			Object keyView = itr2.next();
			System.out.println(keyView);
		}
		
		//iterating over values
		Iterator<String> itr3 = hmap.values().iterator();
		System.out.println("Iterating value");
		while(itr3.hasNext()) {
			Object valueView = itr3.next();
			System.out.println(valueView);
		}
	}

}
