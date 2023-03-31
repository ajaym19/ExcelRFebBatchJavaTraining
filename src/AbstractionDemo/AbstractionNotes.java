package AbstractionDemo;

public class AbstractionNotes {

	/*
	 * Abstraction:
	 * we are trying to hide our code
	 * 
	 * Can be achieved in two ways
	 * 1. Interfaces
	 * 		the class which is implementing the interface should compulsory implement all the methods
	 * 2. Abstract Class
	 * 
	 * 
	 * Method has 2 parts:
	 * 1. Method Signature
	 * 2. Method Body(Implementation)
	 * 
	 */
	
	public static void main(String[] args) {
		HDFCBank hdfc = new HDFCBank();
		hdfc.withdrawMoney();
		hdfc.depositMoney();
		
		ICICBank icici = new ICICBank();
		icici.depositMoney();
		icici.withdrawMoney();
		
		//can you create an object of Interface or Abstract class
		//NO
	}
}
