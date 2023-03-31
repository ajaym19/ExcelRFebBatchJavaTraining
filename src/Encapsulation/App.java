package Encapsulation;

public class App {

	public static void main(String[] args) {
		Students obj = new Students();
		System.out.println(obj.getName());
		obj.setName("Ajay");
		System.out.println(obj.getName());
		
		System.out.println(obj.getRollNo());
		
	}
}
