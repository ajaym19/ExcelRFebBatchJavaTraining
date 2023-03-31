package CollectionsDemo;

import java.util.HashSet;

public class HashSetDemo {

	/*
	 * HashSet:
	 * used to store multiple similar elements
	 * 
	 * Rules:
	 * 1. No order is maintained
	 * 2. Duplicates are not allowed
	 * 3. There is no indexing, so no get and set method
	 */
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(34);
		set.add(67);
		set.add(13);
		set.add(89);
		set.add(89);
		System.out.println(set);

		set.remove(13);
		System.out.println(set);
		System.out.println("Size of the ArrayList is ==>> " + set.size());

		for (Integer a : set) {
			System.out.println(a);
		}
		
		
		
		
		
	}
}
