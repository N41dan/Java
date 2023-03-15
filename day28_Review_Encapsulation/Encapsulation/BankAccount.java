package day28_Review_Encapsulation.Encapsulation;

public class BankAccount {

	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	
	public BankAccount() {
		
	}
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
		}else {
			System.out.println("Not enough balance");
		}
	}
	
	//Getter of Account number
	public int getAccountNumber() {
		return accountNumber;
	}
	//Setter Of Account Number
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber; 
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
