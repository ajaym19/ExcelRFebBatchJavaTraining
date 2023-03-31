package Encapsulation;

public class Students {

	private int id;
	private String name;
	private int rollNo;
	private char division;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public char getDivision() {
		return division;
	}

	public void printId() {
		System.out.println(id);
	}

}
