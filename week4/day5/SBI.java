package week4.day5;

public class SBI extends ICICIBank implements RBIBank {

	public static void main(String[] args) {
		SBI bi=new SBI();
		bi.savingsAccount();
		bi.saving();
		bi.withdrawal();
		bi.deposit();
	}

	@Override
	public void withdrawal() {
		System.out.println("Withdrawal");
	}

	public void saving() {
	System.out.println("My Savings");
		
	}

	public void deposit() {
		System.out.println("Deposit");
	}
}
