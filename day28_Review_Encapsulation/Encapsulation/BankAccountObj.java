package day28_Review_Encapsulation.Encapsulation;

public class BankAccountObj {

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount();
//		account1.accountNumber = 34839;
		account1.setAccountNumber(38473);
		System.out.println(account1.getAccountNumber());
		
		account1.setAccountHolderName("Ali");
		System.out.println(account1.getAccountHolderName()); // Ali
		
		BankAccount account2 = new BankAccount();
		account2.setAccountHolderName("Abdullah");
		account2.setAccountNumber(39434);
		account2.setBalance(10000);
		
		account2.deposit(10000);
		
		System.out.println("New Balance" + account2.getBalance());
	}

}
