package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankUsingWhileLoop 
{
	
	static BufferedReader br;
	double deposit=0,balance=0, depositeAmt;
	String name,age,mob,gender,email;
	int accNum;

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		BankUsingWhileLoop loop= new BankUsingWhileLoop();
		System.out.println("Welcom To The MKPITS Bank ... \n ==========================");
		
		char ch='y';
		while(ch=='y' || ch=='Y')
		{
			System.out.println("Enter Your Choice \n Press 1 for Create Account \n Press 2 for Deposit \n Press 3 for Withdrow \n Press 4 for Balance Enquiry \n Press 5 for Accont Holder Details");
			int choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1:
				loop.creatAccount();
				break;
				
			case 2:
				//System.out.println("Enter Your Deposit Amt :");
				//loop.deposit(Double.parseDouble(br.readLine()));
				//System.out.println("Balance Amount : "+loop.balance);
				
				loop.deposit();
				System.out.println(loop.balance);
				break;
				
			case 3:
				//System.out.println("Enter Withdrow Amount ");
				//loop.withdrowAmt();
				//System.out.println("Balance Amount : "+loop.balance);
				break;
				
			case 4:
				System.out.println("Your Balance :"+loop.balance);
				break;
				
			case 5:
				System.out.println("Account Holder Name :-"+loop.name);
				System.out.println("Account Holder Mobile No. :-"+loop.mob);
				System.out.println("Account Holder Email :-"+loop.email);
				System.out.println("Account Holder Age :-"+loop.age);
				System.out.println("Account Holder Name :-"+loop.gender);
				System.out.println("Account Holder Balance :-"+loop.balance);
				System.out.println("Your Account Number is :-"+loop.accNum);
			
			default:
				break;
				
			}
			System.out.println("Do you Want to Continue ....Please press 'y/Y' ");
			ch=(char) br.read();
			br.readLine();
			
		}
		System.out.println("=================================");
		System.out.println("Thank You "+loop.name);
		
	}
	
	
	private void deposit() throws NumberFormatException, IOException 
	{
		System.out.println("Enter Deposite Money ");
		depositeAmt=Double.parseDouble(br.readLine());
		balance+=depositeAmt;
		System.out.println("Your Total Balance : "+balance);
	}
	
	private void withdrow() 
	{
		System.out.println("Enter Withdrow Amount ");
		
	}


//	private void withdrowAmt(double withdrawAmt) 
//	{
//		this.balance-=withdrawAmt;
//		
//	}
//
//	private void deposit(double diposit) 
//	{
//		this.balance+=diposit; 
//		
//		
//		
//	}

	private void creatAccount() throws IOException
	{
		System.out.println("Enter Your Name ");
		name=br.readLine();
		System.out.println("Enter Your Mobile Number ");
		mob=br.readLine();
		System.out.println("Enter Your Email ");
		email=br.readLine();
		System.out.println("Enter Your Gender ");
		gender=br.readLine();
		System.out.println("Enter Your Age ");
		age=br.readLine();
		accNum=(int)Math.floor(Math.random()*1000000);
	}
	
	

}
