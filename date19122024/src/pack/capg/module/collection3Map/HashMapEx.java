package pack.capg.module.collection3Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

class Product{
	int price;
	String name;
	public Product(String name, int price) {
		super();
		this.price = price;
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Product name: " + name + ", Price: " +price;
	}
	
	
}

public class HashMapEx{
	
	public static void insert() {
			
	}
	
	public static void search() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Product> hmap = new HashMap<Integer, Product>();
		
		hmap.put(201, new Product("Prod1", 500));
		hmap.put(202,  new Product("Prod2", 100));
		
		Iterator<Entry<Integer, Product>> itr = hmap.entrySet().iterator();
		System.out.println("Iterating entries of Hashmap");
		
		while(itr.hasNext()) {
			Object key = itr.next();
			System.out.println(key);
		}
	}

}
