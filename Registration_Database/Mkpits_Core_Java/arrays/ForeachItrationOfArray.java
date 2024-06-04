package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForeachItrationOfArray 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the range :");
		
		int number[]=new int [Integer.parseInt(br.readLine())];
		
		for (int i = 0; i < number.length; i++) 
		{
			System.out.print("Enter the "+(i+1)+" value :- ");
			number[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Read the array : ");
		// for each loop using for iterate the values from arrays 
		for (int i : number) 
		{
			System.out.println("The value Of "+(i)+": "+i);
		}

	}

}
