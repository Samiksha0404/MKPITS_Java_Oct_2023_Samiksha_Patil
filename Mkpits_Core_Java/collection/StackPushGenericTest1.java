package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ListIterator;
import java.util.Stack;

public class StackPushGenericTest1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// creating object of stack class
		Stack<String> cityName=new Stack<String>();
		System.out.println("Enter City 10 Name ");
		// read elements 
		for (int i = 0; i < 10; i++) 
		{
			cityName.push(br.readLine());
		}

		System.out.println("City Names Are :- ");
		
		// 
		ListIterator<String> iterator=cityName.listIterator();	
		while (iterator.hasNext()) 
		{
			System.out.println(iterator.next());
		}
		
	}

}
