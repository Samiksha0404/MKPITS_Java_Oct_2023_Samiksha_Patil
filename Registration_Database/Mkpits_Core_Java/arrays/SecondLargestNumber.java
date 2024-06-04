package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size ");
		int size=Integer.parseInt(br.readLine());
		int [] number= new int[size];
		for (int index = 0; index < number.length; index++) 
		{
			number[index]=Integer.parseInt(br.readLine());
		}
		int secondLarge=0;
		Arrays.sort(number);
		int largest=number[number.length-1];
		System.out.println("Largest Number : "+largest);
		
		for (int i = 0; i < number.length; i++) 
		{
			if(largest>number[i])
			{
				secondLarge=number[i];
				continue;
			}
			break;
		}

		System.out.println("Second Largest : "+secondLarge);
	}

}
