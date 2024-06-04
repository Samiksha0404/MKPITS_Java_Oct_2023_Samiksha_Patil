package com.mkpits.abstraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientMainClass {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		long accNo=(long) Math.ceil(Math.random()*100000);
		System.out.println("Enter Your Opening Ammount ");
		double amount=Double.parseDouble(br.readLine());
		System.out.println("Account Holder Name ");
		String holderName=br.readLine();
		BankAccount obj=new CurrentAccount("Shrikant Bank", accNo, amount, holderName);
		System.out.println("Welcome To "+obj.getBankName());
		char ch='y';
		while(ch=='y')
		{
			System.out.println("Press 1 for Disposit and 2 for Withdraw");
			byte choice=Byte.parseByte(br.readLine());
			switch (choice) 
			{
			case 1:
				System.out.println("Enter The Amount for Diposit ");
				obj.diposit(Double.parseDouble(br.readLine()));
				break;
			case 2:
				System.out.println("Enter The Amount for Withdraw ");
				obj.withdraw(Double.parseDouble(br.readLine()));
				break;

			default:
				System.out.println("Enter Valid Input");
				break;
			}
			System.out.println("Do you Want to Continue ....Please press 'y/Y' ");
			ch=(char) br.read();
			br.readLine();
		}
		
	//	obj.withdraw(500);

	}

}
