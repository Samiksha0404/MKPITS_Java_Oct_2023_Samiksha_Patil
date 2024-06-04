package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortingOfCharecter 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the range of Array :");
		int range=Integer.parseInt(br.readLine());
		char charecter[]=new char[range];
		
		for (int i = 0; i < charecter.length; i++) 
		{
			charecter[i]=(char) br.read();
			br.readLine();
			
		}
		
		for (int i = 0; i < charecter.length; i++) 
		{
			for (int j = i+1; j < charecter.length; j++) 
			{
				char temp=charecter[i];
				charecter[i]=charecter[j];
				charecter[j]=temp;
			}
		}
		
		for (int i = 0; i < charecter.length; i++) 
		{
			System.out.println("Array "+i+" is "+charecter[i]);
		}

	}

}
