package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListIndexOf {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		// declare the array list
		List<Double>petrolPrice=new ArrayList<Double>();
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many Data you want to enter");
		int dataRange=Integer.parseInt(reader.readLine());

		// read the data 
		for (int i = 0; i < dataRange; i++) 
		{
			petrolPrice.add(Double.parseDouble(reader.readLine()));
		}
		System.out.println("Print Petrol Price---->");
		for (Double price : petrolPrice) {
			System.out.println(price);
		}
		
		System.out.println("Enter price to know on which index it belongs");
		double price=Double.parseDouble(reader.readLine());
		System.out.println(petrolPrice.indexOf(price)); // Returns the index of the first occurrence of the specified elementin this list
	}

}
