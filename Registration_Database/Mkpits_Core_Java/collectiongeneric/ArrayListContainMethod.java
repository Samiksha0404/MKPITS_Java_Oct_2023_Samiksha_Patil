package com.mkpits.collectiongeneric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListContainMethod {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// creating object of  the list interface by implementing arraylist class
		List<String>name=new ArrayList<String>();
		System.out.println("Enter The Full Name ");
		for (int i = 0; i < 3; i++) 
		{
			// reading array list from user
			name.add(br.readLine());
		}
//		name.add("Ashik");
//		name.add("Hupram");
//		name.add("Tembhare");
		// print the value from list
		for (String string : name) 
		{
			System.out.println(string);
		}

		System.out.println("Enter the name to check given name is present or not...");
		//Returns true if this list contains the specified element
		System.out.println((name.contains(br.readLine())?"Name is present ":"Name is not present"));
	}

}
