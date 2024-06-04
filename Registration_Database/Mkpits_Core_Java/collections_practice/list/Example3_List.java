package com.mkpits.collections_practice.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Example3_List {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of the List---->");
		int size=Integer.parseInt(br.readLine());
		// generic list 
		List<Integer>numbers=new ArrayList<Integer>(10); // explicitly declare the size of the List
		System.out.println("Enter The Values ----->");
		// reading the value from user
		for (int i = 0; i <size; i++) 
		{
			numbers.add(Integer.parseInt(br.readLine()));
		}
		// itrating the values from list
		System.out.println("Values ----->");
		for (Integer intValue : numbers) 
		{
			System.out.println(intValue);
		}
	}

}
