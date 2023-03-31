package CollectionsDemo;

public class ArrayDemo {
	
	/*
	 * Array:
	 * is used to store multiple similar elements
	 * 
	 * Parts:
	 * 1. Declaration
	 * 2. Instantiation
	 * 3. Initialization
	 * 
	 * Rules:
	 * 1. While instantiating an array, it is compulsory to define the size
	 * 2. Indexing starts from 0
	 * 3. The default value of every element is 0 or null
	 * 4. Duplicates are allowed
	 * 
	 */

	public static void main(String[] args) {
		//Declare
		int id[];
		//int[] a;
		//Instantiation
		id = new int[5];
		System.out.println(id);
		System.out.println(id[0]);
		System.out.println(id[1]);
		
		id[0] = 45;
		//System.out.println(id[0]);
		
		//assign and print to index 1, 2, 3, 4
		id[1] = 98;
		id[2] = 98;
		System.out.println(id[0]);
		System.out.println(id[1]);
		System.out.println(id[2]);
		System.out.println(id[3]);
		
		System.out.println("Length of the Array is "+id.length);
		System.out.println("Printing using for loop");
		for (int i = 0; i < 5; i++) {
			System.out.println(id[i]);
		}
		
		//System.out.println(id[7]); //IndexOutOfBoundException
		
		//Declration + Instatiation together
		int[] b = new int[5];
		
		//Declration + Instatiation + Initalization together
		int[] c = {1,2,3};
		System.out.println(c.length);
		
	}
}
