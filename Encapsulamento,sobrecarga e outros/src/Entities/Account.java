package Entities;

public class Account {

	private String name;
	private double balance;
	private int codeNumber;
	
	public Account(String name, double balance, int codeNumber) {
		this.name = name;
		this.balance = balance;
		this.codeNumber = codeNumber;
	}
	
	public Account(String name,int codeNumber) {
		this.name = name;
		this.codeNumber = codeNumber;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public int getCodeNumber() {
		return codeNumber;
	}

	public void AddBalance(double deposit) {
		double addDeposit = deposit;
		this.balance += addDeposit = deposit; 
	}
	
	public void SubBalance(double withdraw) {
		double subBalance = withdraw;
		this.balance -= (subBalance + 5.00);
	}
	
}
