package com.mkpits.arrays;

import java.util.Iterator;

public class ReversStringByArray {

	public static void main(String[] args) 
	{
		String name="Ashik Kumar Tembhare";
		
		char ch[]=new char[name.length()];
		
		for (int i = 0; i < ch.length; i++) 
		{
			ch[i]=name.charAt(i);
		}
		for (char c : ch) 
		{
			System.out.print(c);
		}
		
		System.out.println("\nRevers Order of string");
		for (int i = ch.length-1; i >=0; i--) 
		{
			System.out.print(ch[i]);
		}
		

	}

}
