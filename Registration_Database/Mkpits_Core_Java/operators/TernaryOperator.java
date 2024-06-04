package com.mkpits.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TernaryOperator {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Check the Biggest Number Among Given Two Number..");
		
		System.out.print("Enter First Num :-");
		int num1=Integer.parseInt(br.readLine());
		System.out.print("Enter Second Num :-");
		int num2=Integer.parseInt(br.readLine());
		
		System.out.println(num1>num2?"Number "+num1+" is Greter Than Number "+num2:"Number "+num2+" is Greter Than Number "+num1);
		
		

	}

}

