package basics;

public class HelloWorld {

	/*
	 * This is a Class
	 * A Class can contain variables and methods
	 * 
	 * main method is the starting point of execution
	 * 
	 * CTRL+SPACE is used for shortcuts
	 * 
	 * Variables:
	 * used to store some temporary values
	 * 
	 */
	
	static int id = 4;
	static String empName = "Ajay";
	
	public static void main(String[] args) {
		int abc = 5;
		System.out.println("Training");
		System.out.println(1);
		System.out.println(empName); //Ajay
		System.out.println("empName");
		System.out.println(id);
		System.out.println("id");
		
		m1();
		
		StudentsDemo.printSchoolName();
		
	}
	
	public static void m1() {
		System.out.println("Java");
	}
	
	
	
	
	
	
}
