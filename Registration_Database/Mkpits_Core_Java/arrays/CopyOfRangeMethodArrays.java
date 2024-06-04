package com.mkpits.arrays;

import java.util.Arrays;

public class CopyOfRangeMethodArrays 
{
	public static void main(String[] args) 
	{
		String name[]= {"Ashik","Pranav","Raj","Samiksh","Vaibhav","Rugved","Shivani","Sanket","Vinay","Kaushtub"};
		for (String s : name)  // for each loop 
		{
			System.out.println(s);
		}
		
		String[] name1=Arrays.copyOfRange(name, 5, 9);// copyOfRange method used to copied the data from given point to exit point
		// Arrays.toString method used to read values from array in string format 
		System.out.println("\nThe Copied Array from 'Name' is : "+Arrays.toString(name1));
		
		// using copyOf Method
		
		System.out.println("\nUsing copyOf Method Copy Array :");
		
		String[] name3=Arrays.copyOf(name, 5);// in this method we can only put the end point where we have to copid that data
		for (String s : name3) 
		{
			System.out.println(s);
		}
	}

}
