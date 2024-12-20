package pack.capg.module.collections2;
import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("First"); al.add("Third"); al.add("eighth");
		System.out.println("Arraylist elements: "+al);
		
		
		HashSet<String> set = new HashSet<String>();
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		set.add("fifth");
		set.add(null);
		
		System.out.println("Hashset element "+set);
		
		set.add("First"); // duplicates
		set.add("fifth");
		set.add("Fifth");
		System.out.println("After adding duplicates: ");
		System.out.println(set);
		System.out.println("add more null");
		set.add(null);
		System.out.println("After adding null");
		System.out.println(set);
		
		System.out.println("Lets add al into hashset: ");
		set.addAll(al);
		
		System.out.println("Unordered hashset elements without duplicate elements: ");
		System.out.println(set);
		
		if(set.contains("Fifth")) {
			System.out.println("Available");
		} else {
			System.out.println("Not available");
		}
		
		System.out.println("Set size: "+ set.size());
		
		System.out.println("Lets remove arraylist elements from hashset: ");
		set.removeAll(al);
		System.out.println("After removing arraylist elemnt : "+set);
		
		System.out.println(" clear the hashset: ");
		set.clear();
		System.out.println("After clearing: "+set);
	}

}
