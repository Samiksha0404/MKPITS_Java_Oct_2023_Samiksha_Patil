package com.mkpits.abstraction;

public class CurrentAccount extends BankAccount 
{
	String accHolderName;
	public CurrentAccount(String bankName, long accNumber, double balance, String accHolderName)
	{
		super(bankName, accNumber, balance);
		this.accHolderName=accHolderName;
		
	}
	
	
	@Override
	public void diposit(double diposit)
	{
		
		setBalance(getBalence()+diposit);
		System.out.println("Your Total Balance is : "+getBalence());
		
	}
	@Override
	public void withdraw(double withdraw) 
	{
		if(getBalence()>=withdraw)
		{
			setBalance(getBalence()-withdraw);
			System.out.println("You have withdraw "+withdraw+" rs Your Balance is "+getBalence());
		}
		else
			System.out.println("insufficient Balance");
		
	}

	
	
}
