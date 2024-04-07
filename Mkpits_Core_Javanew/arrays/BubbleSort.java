package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 10 element in Array ");
		
		int[] number=new int[10];
		// taking input from user
		for (int i = 0; i < number.length; i++) 
		{
			number[i]=Integer.parseInt(br.readLine());
		}
		// sorting using bubble sort
		for (int i = 0; i < number.length; i++) 
		{
			for (int j = i+1; j < number.length; j++) 
			{
				if(number[i]>number[j])
				{
					int temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
			
		}
		
		System.out.println("Sorted Array");
		// sorted array
		for (int i = 0; i < number.length; i++) 
		{
			System.out.println(number[i]);
		}

	}

}
