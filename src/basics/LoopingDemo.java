package basics;

public class LoopingDemo {

	public static void main(String[] args) {
		// print numbers from 1 to 10
		// for loop: init, condition_check, increment/decrement
		for (int i = 1; i <= 100; i++) {
			// System.out.println(i);
		}

		// while loop
		int counter = 0;
		while (counter <= 10) {
			System.out.println(counter);
			counter++;
		}

		// print name Ajay, 10 times
		// do this assignment

		// Conditional statements
		int age = 2;
		if (age >= 18) {
			System.out.println("Allowed to vote");
		} else {
			System.out.println("Not allowed to vote");
		}

		// if age <2 : toddler
		// if age > 2 and less than 18: kid
		// if age > 18 print adult

		if (age <= 2) {
			System.out.println("Toddler");
		} else if (age > 2 && age <= 18) {
			System.out.println("Kid");
		}else {
			System.out.println("Adult");
		}
		
		//print grade based on percentage

	}

}
