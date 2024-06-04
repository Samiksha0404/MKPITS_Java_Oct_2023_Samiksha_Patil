package com.mkpits.arrays;

public class ArrayCopyMethod {

	public static void main(String[] args) 
	{
		String name[]= {"Ashik","Pranav","Raj","Samiksh","Vaibhav","Rugved","Shivani","Sanket","Vinay","Kaushtub"};
		for (String s : name) 
		{
			System.out.println(s);
		}
		String name1[]= new String[5];
		System.arraycopy(name, 2, name1, 0, 5);
		System.out.println("\n");
		for (String s : name1) 
		{
			System.out.println(s);
		}
	}

}
