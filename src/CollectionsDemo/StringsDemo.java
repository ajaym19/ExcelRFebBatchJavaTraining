package CollectionsDemo;

public class StringsDemo {
	
	/*
	 * String
	 * is a class in JAVA
	 * 
	 * string objects are immutable
	 * 
	 * 1. String literal
	 * 2. using new keyword
	 * 
	 */

	public static void main(String[] args) {
		int id = 5;
		System.out.println(id); //5
		
		id = 23;
		System.out.println(id); //23
		
		String name = "Ajay";
		System.out.println(name.length());
		System.out.println(name); //Ajay
		name = name.concat("Trainer");
		System.out.println(name); //AjayTrainer
		
		String job = new String("HR");
		System.out.println(job);
		
		String s1 = "Java";
		String s2 = "Java";
		
		String s3 = new String("World");
		String s4 = new String("World");
		
		//String FUnctions
		
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		
		//print each character one by one
		System.out.println("Printing each character one by one");
		for(int i = 0; i < name.length();i++) {
			System.out.println(name.charAt(i));
		}
		
		System.out.println(name.contains("Shweta"));
		
		// int comparison
		int id1 = 22;
		int id2 = 22;
		System.out.println(id1 == id2);
		
		//String comparison
		String str1 = "Ajay";
		String str2 = "ajay";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		//Assignment : Print the string in reverse
		//Input: Ajay
		//Output: yajA
		

	}
}
