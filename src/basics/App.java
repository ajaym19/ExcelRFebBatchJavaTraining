package basics;

public class App {

	public static void main(String[] args) {
		// to access the variables and methods
		// we need to create an object of the class

		// class_name ref_var_name = new_keyword constructor_call

		StudentsDemo s1 = new StudentsDemo();
		s1.stdId = 1;
		System.out.println(s1.stdId);

		s1.attendLectures();
		s1.printId();
		s1.printname();

		s1.name = "Ajay";
		s1.printname();

		StudentsDemo s2 = new StudentsDemo();
		s2.stdId = 2;
		s2.name = "Prakash";
		s2.printId();
		s2.printname();

	}
}
