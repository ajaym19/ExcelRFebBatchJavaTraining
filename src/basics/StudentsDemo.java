package basics;

public class StudentsDemo {

	int stdId;
	String name;
	char division;
	static String schoolName;
	long mobileNo;

	public void attendLectures() {
		System.out.println("Students attending Lectures");
	}

	public void doHomework() {
		System.out.println("Students are doing homework");
	}

	public void submitAssignment() {
		System.out.println("Students are submitting assignments");
	}

	public void printId() {
		System.out.println("ID is " + stdId);
	}

	public void printname() {
		System.out.println("Name is " + name);
	}
	
	public static void printSchoolName() {
		System.out.println("School Name is "+ schoolName);
	}

}
