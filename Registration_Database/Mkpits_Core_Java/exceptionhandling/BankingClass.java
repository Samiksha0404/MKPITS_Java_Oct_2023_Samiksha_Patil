package com.mkpits.exceptionhandling;

public class BankingClass
{
	double amount, balance, withdraw;
	// constructor 
	public BankingClass(double balance) 
	{
		super();
		this.balance=balance;
	}

	// diposite method
	public void diposite(double depositeAmt) 
	{
		this.balance+=depositeAmt;
		System.out.println("Amount Has been Deposited");
		System.out.println("Your Balance is "+balance);
	}
		
		
	
	// withdraw method
	public void withdraw(double withdrawAmt)
	{
		// try block
		try {
			double amt=balance;
			if((amt-=withdrawAmt)<=500)
			{
				throw new ExceptionClass(balance);
			}
			else 
			{
				this.balance-=withdrawAmt;
				System.out.println("Amount has been Withdraw Sucessfully");
				System.out.println("Your Balance is "+balance);
			}
		}
		// catch block
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
