package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListStringTest {

	public static void main(String[] args) {
		
		List<String>names=new ArrayList<String>();// Create list to add name 
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		// using for loop read the value from user
		for(int start=0;start<2;start++)
		{
			String name="";
			System.out.println("Enter "+(start+1)+" name");
			try {
				name=reader.readLine();
				names.add(name);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		// print the values from list using Iterator
		System.out.println("===============================\nIterator\n ");
		Iterator n=names.iterator();
		while (n.hasNext()) 
		{
			String string = (String) n.next(); // if you are not declare class in <> then you have to type cast
			System.out.println(" "+string);
			
		}
		

	}

}
