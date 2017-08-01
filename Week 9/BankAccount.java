/******************************************************************************
 * BankAccount.java
 * Author: Jacob Zimmer
 *****************************************************************************/

public class BankAccount {
	
	private String name;		// Owner of the account
	private String accountID;	// ID of the account
	private String password;	// Account owner's password
	private double balance;		// Amount of money in the account


	public BankAccount() {
		name = "user";
		accountID = "0";
		password = "password";
		balance = 0;
	}

	public BankAccount(String name, String accountID, 
					   String password, double balance) {
		this.name = name;
		this.accountID = accountID;
		this.password = password;
		this.balance = balance;
	}


	// Returns the name of the owner of the account.
	public String getName() {
		return name;
	}

	// Returns the ID of the owner of the account.
	public String getID() {
		return accountID;
	}

	// Returns the current account balance.
	public double checkBalance() {
		return balance;
	}

	// Remove money from the balance of the account. Returns true if the 
	// withdrawl is successful, and false otherwise.  Amount is the amount
	// to withdraw from the account.
	public boolean makeWithdrawl(double amount) {
		if (amount > balance) {
			return false;
		} else if (amount <= 0) {
			return false;
		} else {
			balance = balance - amount;
			return true;
		}
	}

	// Add money to the balance of the account. Returns true if the money
	// was successfully added, and false otherwise.  Amount is the amount
	// to deposit in the account.
	public boolean makeDeposit(double amount) {
		if (amount <= 0) {
			return false;
		} else {
			balance = balance + amount;
			return true;
		}
	}

	public String toString() {
		return getName() + "\n" + getID() + "\n" + checkBalance();
	}

	public static void main(String[] args){
		
		BankAccount userAccount = new BankAccount("Jacob", "12345", 
												  "password123", 34575491);

		System.out.println(userAccount.getName());
		System.out.println(userAccount.getID());
		System.out.println(userAccount.checkBalance());

		System.out.println(userAccount.makeDeposit(100));
		System.out.println(userAccount.checkBalance());

		System.out.println(userAccount.makeWithdrawl(10));
		System.out.println(userAccount.checkBalance());

		System.out.println(userAccount.makeDeposit(-1000));
		System.out.println(userAccount.checkBalance());

		System.out.println(userAccount.makeWithdrawl(-100));
		System.out.println(userAccount.checkBalance());

		System.out.println(userAccount.makeWithdrawl(100));
		System.out.println(userAccount.checkBalance());


		System.out.println(userAccount);
	}	








}