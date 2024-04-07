package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchBank {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		MethodsOfBank mb=new MethodsOfBank();
		System.out.println("Bank \n Press  1--> Create Account \n Press 2--> View Details \n Press 3--> Deposit Money \n Press 4--> Withdroe Money \n Press 5-->Check Balance \n");
		int cond=1;
		for(int i=1;i<=cond;i++)
		{
			
			System.out.println("Enter your choice :");
			int choice =Integer.parseInt(br.readLine());
			
			switch (choice) {
			case 1:
				System.out.println("Create Your Account Please Fill All Details....");
				System.out.println("Enter Your Name :");
				mb.setName(br.readLine());
				System.out.println("Enter Your Mobile No. :");
				mb.setMobNo(Long.parseLong(br.readLine()));
				System.out.println("Enter Your Addhar :");
				mb.setAadharNo(Long.parseLong(br.readLine()));
				System.out.println("Enter Your Address :");
				mb.setAddress(br.readLine());
				System.out.println("Deposite First Balence Money :");
				mb.setDeposit(Double.parseDouble(br.readLine()));
				break;

			case 2:
				System.out.println("Your Details :");
				System.out.println("===================================");
				mb.showDetails();
				 break;
				 
			case 3:
				System.out.println("Deposite Money :");
				double deposit=Double.parseDouble(br.readLine());
				mb.deposit(deposit);
				System.out.println("Total Balanece :- "+mb.getBalence());
				break;
				
			case 4:
				System.out.println("Withdrow Money ... ");
				double withdrow=Double.parseDouble(br.readLine());
				mb.withdrowMoney(withdrow);
				System.out.println("Remaining balence :"+mb.getBalence());
				break;
				
			case 5:
				System.out.println("Balence....");
				System.out.println("Your Balence :- "+mb.getBalence());
				  

			default:
				break;
			}
			
			System.out.println("Do you want to continue ....press y/Y otherwise n/N");
			char ch=(char)br.read();
			br.readLine();
			if(ch=='y' || ch=='Y')
			{
				cond++;
			} 
			if(ch=='n' || ch == 'N')
			{
				break;
			}
		}
		System.out.println("Thank You .....");

	}

}
