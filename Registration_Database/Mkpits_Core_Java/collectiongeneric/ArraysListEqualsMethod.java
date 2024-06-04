package com.mkpits.collectiongeneric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArraysListEqualsMethod {

	public static void main(String[] args) throws IOException {
		
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		List<String>fruitNames=new ArrayList<String>();
		System.out.println("Enter 5 food items-->");
		for (int i = 0; i < 5; i++) 
		{
			// reading values by user
			fruitNames.add(read.readLine());
		}
		
		System.out.println("Food Items---> "+fruitNames);
		//Compares this string to the specified object. The result is true if and only if the argument is not null 
		//and is a String object that represents the same sequence of characters as this object. 
		System.out.println(fruitNames.get(0).equals(fruitNames.get(3))?"Present":"not present");
		
		
	}

}
