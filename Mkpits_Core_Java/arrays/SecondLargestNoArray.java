package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// Requirement : Find the second largest number from array
// design : take loop to read the array from user and assign value to the corresponding index index
// Development : soar the array in ascending order and sub the index 

public class SecondLargestNoArray {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Array Size");
		byte size=Byte.parseByte(br.readLine());
		int array[]= new int[size];
		System.out.println("Read the array from user :");
		for (int index = 0; index < array.length; index++) 
		{
			array[index]=Integer.parseInt(br.readLine());
			
		}
		Arrays.sort(array); // Sorts the specified array into ascending numerical order. sort() is arrays class method
		System.out.println(Arrays.toString(array));
		System.out.println(array.length); // length is used to find out the length of the array
		System.out.println("Second Largest Number : "+array[array.length-2]);
	}

}
