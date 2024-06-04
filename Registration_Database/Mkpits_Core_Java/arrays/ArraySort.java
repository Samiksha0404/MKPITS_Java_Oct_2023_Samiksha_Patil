package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the Range of Array :- ");
		int number[]=new int[Integer.parseInt(br.readLine())];
		
		System.out.println("Enter the values of Array :");
		
		for (int i = 0; i < number.length; i++) 
		{
			 number[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Sorted Array");
		Arrays.sort(number); // Arrays.sort() method used to sort an array in ascending order
		for (int i : number) 
		{
			System.out.println(i);
		}
		
		// to sort array in descending order we used Collectio.reverse() method 
		
		System.out.println("\nDescending order of Array :");
		//Arrays.sort(number, Collections.reverseOrder());

	}

}
