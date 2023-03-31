package InheritanceAndPolymorphism;

public class MethodOverloadingDemo {

	/*
	 * Method Overloading: method with same but having different signatures
	 */

	public static void main(String[] args) {
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.add(45, 20);
		obj.add(2, 4, 6);
		obj.add(23.5, 34.7);
	}

	public void add(int a, int b) {
		System.out.println("Adding 2 int numbers");
	}

	public void add(int a, int b, int c) {
		System.out.println("Adding 3 int numbers");
	}

	public void add(double a, double b) {
		System.out.println("Adding 2 double number");
	}

}
