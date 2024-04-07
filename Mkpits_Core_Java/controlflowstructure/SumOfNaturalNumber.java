package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNaturalNumber {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Number for Addition : ");
		int num=Integer.parseInt(br.readLine());
		int sum=0;
		for(int i=0 ;i<=num;i++)
		{
			System.out.println(sum+=i);
		}

	}

}
