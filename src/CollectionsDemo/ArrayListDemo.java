package CollectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	/*
	 * ArrayList:
	 * we use to store multiple elements of similar data type
	 * available in java.util package
	 * 
	 * CRUD Operations
	 * Create
	 * Read
	 * Update
	 * Delete
	 * 
	 * Rules:
	 * 1. Insertion Order is maintained
	 * 2. Duplicates are allowed
	 * 3. Multiple Null values are allowed
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		
		// Adding elements
		list.add(101);
		list.add(67);
		list.add(34);
		list.add(10);
		list.add(125);
		list.add(67);
		list.add(null);
		list.add(null);

		System.out.println(list);
		
		//get the element
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		//print all the elements one by one
		System.out.println("Size of the ArrayList is ==>> "+list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list);
		list.set(1, 110);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		//System.out.println(list.get(34));
		System.out.println(list.contains(111));
		System.out.println("Is your List Empty ==>> "+list.isEmpty());
		list.clear();
		System.out.println("Is your List Empty ==>> "+list.isEmpty());
		
	}
}
