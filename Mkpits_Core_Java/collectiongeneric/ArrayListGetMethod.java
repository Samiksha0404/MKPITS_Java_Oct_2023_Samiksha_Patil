package com.mkpits.collectiongeneric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListGetMethod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		// creating obj of the list by implementing arraylist class
		List<Integer>marks=new ArrayList<Integer>();
		System.out.println("Enter 5 Subjects Marks --> ");
		for (int i = 0; i < 5; i++) 
		{
			// reading values by user
			marks.add(Integer.parseInt(read.readLine()));
		}

		System.out.println("Marks---> "+marks);
		
		System.out.println("Enter the Index to get value ----> ");
		
		//Returns the element at the specified position in this list.
		int mark=marks.get(Integer.parseInt(read.readLine()));
		// print value
		System.out.println("Mark on index---> "+mark);
		
	}

}
