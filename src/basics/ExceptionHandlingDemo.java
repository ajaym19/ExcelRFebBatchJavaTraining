package basics;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingDemo {

	/*
	 * Exception:
	 * an unwanted event causing interruption to normal flow of execution
	 * If there is an exception, the execution of the code ends abrubtly
	 * 
	 * we need to handle the exception
	 * try: risky lines of code
	 * catch: what to do if exception occurs
	 * finally
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(1); //1
	//	System.out.println(4/0); //2
		System.out.println("Ajay"); //Ajay
		
		try {
			System.out.println("I am in try block");
			FileReader reader = new FileReader("file_name");
		} catch (FileNotFoundException obj) {
			System.out.println("I am in catch block");
		}
		
		try {
			System.out.println("I am in try block for Division");
		//	System.out.println(4/0); 
			FileReader reader = new FileReader("file_name");
		} catch (FileNotFoundException e) {
			System.out.println("I am in catch block");
		}
		
		System.out.println("Hello");
		
		try {
			System.out.println("Open the Connection");
			System.out.println("Trying to read the data");
			//FileReader reader = new FileReader("file_name");			
		} catch (Exception e) {
			System.out.println("Unable to read the data");
		} finally {
			System.out.println("Closing the connection");
		}
		
		int id;
	//	System.out.println(id);
		
		
		//FileReader reader = new FileReader("file_name");
		//System.out.println(4/0); //
		
		int[] ids = {2,34,45};
		//System.out.println(ids[5]);
		
		
		
		
		
	}
}
