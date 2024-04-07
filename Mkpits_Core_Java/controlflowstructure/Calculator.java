package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 
public class Calculator {

	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter first num");
		int value1=Integer.parseInt(br.readLine());
		System.out.println("enter second num");
		int value2=Integer.parseInt(br.readLine());
		System.out.println("enter your choice");
		char choice=(char) br.read();
		br.readLine();
		 switch(choice)
		 {
		 case '+':
			 addition(value1, value2);
		 }
		

	}

	static void addition(int value1, int value2) throws IOException 
	{
		int sum=value1+value2;
		char ch='y';
		while(true)
		{
			System.out.println("Do you wish to continue ");
			ch=(char) br.read();
			br.readLine();
		if(ch=='y')
		{	
			int a;
			System.out.println("Enter Num"); 
			a=Integer.parseInt(br.readLine());
			sum+=a;
			continue;
		}
		break;
		}
		System.out.println(sum);

	}
}
