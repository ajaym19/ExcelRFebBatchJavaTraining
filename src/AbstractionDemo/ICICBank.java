package AbstractionDemo;

public class ICICBank implements IRBI {

	@Override
	public void withdrawMoney() {
		System.out.println("ICICI Bank WIthdrawing Money");

	}

	@Override
	public void depositMoney() {
		System.out.println("ICICI Bank Depositing Money");

	}

}
