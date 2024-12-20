package pack.capg.module.collection3Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int max = 5;
		Map<String, String> map = new LinkedHashMap<String, String>(){
		protected boolean removeEldestEntry(Map.Entry<String, String> e) {
			return size() > max;
		}};
		
		System.out.println("Initial entries of linkedhashmap: ");
		System.out.println(map);
		
		map.put("Appple", "Green");
		map.put("Banana", "Yellow");
		map.put("Cherry", "Red");
		map.put("Orange", "Orange");
		map.put("Guava", "Pink");
		System.out.println("All Entries: "+map);
		
		map.put("Strawberry", "red");
		System.out.println("Displaying map after new entries: "+map);
		
		Iterator<Entry<String, String>> itr = map.entrySet().iterator();
		System.out.println("iterating entries of LinkedHashMap: ");
		while(itr.hasNext()) {
			Object key = itr.next();
			System.out.println(key);
		}
		System.out.println("\n");
		
		System.out.println("KEYSEt: ");
		Iterator<String> itr2 = map.keySet().iterator();
		System.out.println("iterating keys of LinkedHashMap: ");
		while(itr2.hasNext()) {
			Object key = itr2.next();
			System.out.println(key);
		}
		System.out.println("\n");
		
		
		/*
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        // Adding elements to the LinkedHashMap
        lhm.put(1, "Apple");
        lhm.put(2, "Banana");
        lhm.put(3, "Cherry");
        lhm.put(4, "Date");

        // Displaying the LinkedHashMap
        System.out.println("LinkedHashMap: " + lhm);

        // Access
        String fruit = lhm.get(2);
        System.out.println("Element with key 2: " + fruit);

        // Remove
        lhm.remove(3);
        System.out.println("After removing key 3: " + lhm);

        // Iterate
        System.out.println("Iterating over LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : lhm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        } */
	}

}
