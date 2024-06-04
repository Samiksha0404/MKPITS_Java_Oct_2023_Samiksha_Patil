package com.mkpits.arrays;

public class ReversString {

	public static void main(String[] args) 
	{
		String name="Ashik Tembhare";
		System.out.print("Original Name :"+name);
		char newName;
		String n="";
		for(int i=name.length()-1;i>=0;i--)
		{
			newName=name.charAt(i);
			n=n+newName;
		}
		
		System.out.print("\nRevers Order Of Name :"+n);

	}

}