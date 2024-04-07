package com.mkpits.abstraction;

public abstract class BankAccount 
{
	long accNumber;
	String bankName;
	double balence;
	public BankAccount(String bankName,long accNumber , double balance) 
	{
		this.bankName=bankName;
		this.accNumber=accNumber;
		this.balence=balance;
	}
	
	public void setBalance(double balance)
	{
		this.balence=balance;
	}
	
	
	
	public long getAccNumber() {
		return accNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public double getBalence() {
		return balence;
	}

	public abstract void diposit(double diposit);
	public abstract void withdraw(double withdraw);
}
