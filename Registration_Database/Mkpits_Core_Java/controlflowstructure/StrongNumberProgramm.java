package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrongNumberProgramm 
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no to check the number is strong no. are not ");
		int number=Integer.parseInt(br.readLine());
	
			if (isItStrong(number))
			{			
				System.out.print("It is a Strong Number "+number);
			}
			else
			{
				System.out.println("Its not Strong Number plzz Enter another number ");
			}
		
	}
	
	// checking the no is String number or not
	static boolean isItStrong(int num) 
	{
		int copyNo = num;
		int sum = 0;
		while (copyNo > 0) 
		{
			int lastDigit = copyNo % 10;
			sum += fact(lastDigit);
 
			copyNo = copyNo / 10;
		}
		return sum == num;
	}
	
	// factorial of the last digit number
	static int fact(int digit) 
	{
		int fact = 1;
		for (int j = digit; j > 1; j--) 
		{
			fact *= j;
		}
		return fact;
	}
}
