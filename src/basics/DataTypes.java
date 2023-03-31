package basics;

public class DataTypes {

	/*
	 * Data Types:
	 * it is compulsory to define a data type for every variable
	 * Data type gives the information of the type or kind of data we want to store
	 * 
	 * Data Types:
	 * 1. Primitive - (8)
	 * 		Integer - byte, short, int, long
	 * 		Decimal - float, double
	 * 		character - char
	 * 		yes or no - boolean
	 * 
	 * 2. Non Primitive: Array, String
	 * 
	 */
	public static void main(String[] args) {
		int id = 5;
		byte b = 13; //-128 to 127
		short s = 32767; //-32768 to 32767
		int i = 3434343; //-2^31 to 2^31
		long l = 23232;
		
		float f = 45.56f;
		double d  =45.6776;
		
		//a, A, b, C, 1, @, &
		//with character, it is compulsory to use single quotes
		char c = 'a';
		char c1 = '%';
		System.out.println(c);
		System.out.println(c1);
		
		boolean ispresent = true;
		boolean b2  =false;
		System.out.println(ispresent);
		System.out.println(b2);
		
		//String: sequence of characters
		//with string, always use double quotes
		String name = "bb";
		String dept = "HR";
		System.out.println(name);
		
		
	}
}
