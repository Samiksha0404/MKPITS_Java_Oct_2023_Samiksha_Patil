package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackPeekMethod {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// creating obj of the stack class
		Stack<Integer>serialNo=new Stack<Integer>();
		System.out.println("Enter The 10 Serial Number----->");
		// read serial number from user
		for (int i = 0; i < 10; i++) 
		{
			serialNo.add(Integer.parseInt(br.readLine()));
		}
		
		//Looks at the object at the top of this stack without removing itfrom the stack.
		System.out.println("First serial Number :- "+serialNo.peek());
	}

}
