package CollectionsDemo;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	/*
	 * HashMap:
	 * used to store multiple elements
	 * elements are stored in the form of key and value pair
	 * 
	 * Rules:
	 * 1. Duplicate values are allowed
	 * 2. Duplicate null values are allowed
	 * 3. Duplicate key is not allowed, if added, it will work as an Update
	 * 4. Null key is allowed but only one
	 * 
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "AJay");
		map.put(2, "Priyanka");
		map.put(3, "Priyanka");
		map.put(4, null);
		map.put(5, null);
		System.out.println(map);
		map.put(1, "Shweta");
		System.out.println(map);
		map.put(null, "Lucky");
		map.put(null, "Raj");
		System.out.println(map);
		
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("Raja"));
		
		System.out.println(map.keySet());
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		map.remove(1);
		System.out.println(map);
		
		map.replace(2, "newPriyanak");
		System.out.println(map);
		
		
	}
}
