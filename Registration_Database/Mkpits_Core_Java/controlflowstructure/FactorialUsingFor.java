package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialUsingFor {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Your Number :-");
		int num=Integer.parseInt(read.readLine());
		int factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial :-"+factorial);
		

	}

}
