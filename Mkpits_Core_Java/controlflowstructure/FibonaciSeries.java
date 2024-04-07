package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonaciSeries {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Fibbonacii Series \n ==========================");
		System.out.println("Enter Value :");
		int num=Integer.parseInt(br.readLine());
		int num1=1,num2=1,fibo;
		
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<=num;i++)
		{
			fibo=num1+num2;
			System.out.println(fibo);
			num1=num2;
			num2=fibo;
		}
	}

}
