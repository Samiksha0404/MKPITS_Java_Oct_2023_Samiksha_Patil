package com.mkpits.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerBankingCall {

	public static void main(String[] args) throws NumberFormatException, IOException, ExceptionClass 
	{
		BankingClass bankingClass=new BankingClass(500);
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		char wish='y';
		while(wish=='y')
		{
		System.out.println("Enter Your Choice \n1. Deposite \n 2. Withdraw \n 3. Balance ");
		byte choice=Byte.parseByte(reader.readLine());
		switch(choice)
		{
		case 1:
			System.out.println("Enter the Diposite Amt");
			bankingClass.diposite(Double.parseDouble(reader.readLine()));
			break;
		case 2:
			System.out.println("Enter the Witghdrow Amount ");
			bankingClass.withdraw(Double.parseDouble(reader.readLine()));
			break;
		default :
			System.out.println("Invalid Choice");
		
		}
		
		System.out.println("Do you wish to continue ");
		wish=(char) reader.read();
		reader.readLine();
		}
	}

}
