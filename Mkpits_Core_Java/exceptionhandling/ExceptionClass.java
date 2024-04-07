package com.mkpits.exceptionhandling;

public class ExceptionClass extends Exception
{
	double amount;


	public ExceptionClass(double depositeAmt) 
	{
		this.amount = depositeAmt;
	}


	// The toString() method returns the String representation of the object.
	public String toString() {
		return "You Dont have Sufficient Balence Your Balance Is : "+amount;
	}
	
	
	
	
}
