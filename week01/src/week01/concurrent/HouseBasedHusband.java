package week01.concurrent;

public class HouseBasedHusband implements Runnable {
	
	private BankAccount bankAccount;
	
	
	public HouseBasedHusband(BankAccount bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}

	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			bankAccount.deposit(i*1000);
		}
	}

}
