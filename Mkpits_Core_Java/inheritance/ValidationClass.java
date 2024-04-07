package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mkpits.controlflowstructure.BreakAndContinueStatment;

public class ValidationClass {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char ch='y';
		while(ch=='y')
		{
			System.out.println("Enter your Name :");
			String name=br.readLine();
			if(name.isEmpty())
			{
				System.out.println("Please Enter Your Name");
				continue;
			}
			System.out.println("Enter Your Mob number");
			String mob=br.readLine();
			if(mob.isEmpty())
			{
				System.out.println("Please Enter Your Mobile number");
			}
			break;
			
			
		
		}
		
		
		
	}

}
