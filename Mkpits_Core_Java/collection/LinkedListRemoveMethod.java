package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class LinkedListRemoveMethod {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// creating obj of the list interface by implementing LinkedList class
		LinkedList<Integer>numbers=new LinkedList<Integer>();
		System.out.println("Insert Number-->");
		for (int i = 0; i < 10; i++) 
		{
			numbers.add(Integer.parseInt(br.readLine()));
		}
		
		System.out.println("Inserted Numbers are--->");
		for (Integer num : numbers) {
			System.out.println(num);
		}
		
		for (int i = 0; i < numbers.size(); i++) 
		{
			if(numbers.get(i)%2!=0)
			{
				numbers.remove(i);
			}
			
		}
		System.out.println(numbers);
		
		

	}

}
