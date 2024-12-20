package pack.capg.module.collection3Map;

import java.util.*;


// lru - least recently used cache

public class LinkedhashMapCache {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private final int capacity;
		private final Map<Integer, Integer> cache;
		
		public LinkedhashMapCache(int capacity) {
			super();
			this.capacity = capacity;
			this.cache = new LinkedHashMap<>(capacity, 0.75f, true);
		}
		
		public int get(int key) {
			return cache.getOrDefault(key, -1);
		}
		
		public void put(int key, int value) {
			if(cache.size() >= capacity) {
				int oldKey = cache.keySet().iterator().next();
				cache.remove(oldKey);
			}
			cache.put(key, value);
		}
		
		public static void main(String[] args) {
			LinkedhashMapCache cache = new LinkedhashMapCache(3);
			cache.put(1, 1);
			cache.put(2, 2);
			cache.put(3, 3);
			System.out.println(cache.get(1));
			cache.put(4, 4);
			System.out.println(cache.get(2));
		
		}
}


