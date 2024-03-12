package week01.concurrent;

public class BankAccount {
	
	private double balance;
	private String accountNo;
	
	public BankAccount(double balance, String accountNo) {
		super();
		this.balance = balance;
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountNo() {
		return accountNo;
	}
	
	public void withdow(double amount) {
		if(amount > 0 && balance > amount) {
			this.balance -= amount;
			System.out.println("Withdrawal Successfull!");
		}else {
			// try to use custom exception in assignment
			throw new IllegalArgumentException("Insifficient funds or invalid amount");
			
		}
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			System.out.println("Deposit Successfull!");
		}else {
			throw new IllegalArgumentException("invalid deposit amount. amount can not be 0 or lesser");
		}
	}

}
