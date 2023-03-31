package AbstractionDemo;

public class HDFCBank implements IRBI {

	@Override
	public void withdrawMoney() {
		System.out.println("HDFC Bank Withdrawing Money");

	}

	@Override
	public void depositMoney() {
		System.out.println("HDFC Bank Depositing Money");

	}

}
