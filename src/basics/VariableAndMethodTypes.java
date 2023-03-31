package basics;

public class VariableAndMethodTypes {

	/*
	 * Types of Variables 1. Instance: dependent on the object 2. Static: not
	 * dependent on the object
	 * 
	 * Types of Methods: 1. Instance: accessing instance variables 2. Static:
	 * accessing only static variables or no variables
	 * 
	 * access_modifier static_instance return_type method_name (arguments)
	 * 
	 * Rule: from static area, we cannot access instance variable and instance
	 * methods from instance area, we can access both static as well as instance
	 */

	int id;
	static int rollno;
	int pancard;

	// whenever we create an object, constructor is called
//	public VariableAndMethodTypes() {
//		System.out.println("I am in constructor");
//		id = 4;
//		abc = 34;
//	}

	// parametrized constructor
	public VariableAndMethodTypes(int a, int b) {
		id = a;
		rollno = b;
	}

	public VariableAndMethodTypes(int pancard) {
		// to access global variable, we use this keyword
		this.pancard = pancard;

	}

	public static void main(String[] args) {
		printInfo();
		VariableAndMethodTypes obj = new VariableAndMethodTypes(22, 23);
		VariableAndMethodTypes obj1 = new VariableAndMethodTypes(34343454);
		obj.printId();
		// printId(); this is not allowed
		// System.out.println(id); //this is not allowed
		obj.add(2, 5);
		int value = obj.sum(10, 20);
		System.out.println(value);
		System.out.println(obj1.pancard);
	}

	public static void printInfo() {
		System.out.println("Printing Information");
	}

	public void printId() {
		System.out.println("Printing Instance Variable ID");
		System.out.println(id);
		System.out.println(rollno);
	}

	public void add(int a, int b) {
		int t = 5; // this is a local variable
		System.out.println(t);
		System.out.println(a + b);
	}

	public int sum(int a, int b) {
		System.out.println(a + b);
		int total = a + b;
		// System.out.println(t); cannot access local variable outside the scope
		return total;
		// System.out.println(); return should be the last line
	}

	public String getName() {
		return "Ajay";
	}

	

}
