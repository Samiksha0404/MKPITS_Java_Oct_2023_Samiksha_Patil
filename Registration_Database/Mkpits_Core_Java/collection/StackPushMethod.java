package com.mkpits.collection;

import java.util.List;
import java.util.Stack;

public class StackPushMethod {

	public static void main(String[] args) 
	{

		// creating the object of the List interface by implementing Stack class 
		List input= new Stack();
		// stoore the data by using add() method
		input.add(22124);
		input.add("Ashik Kumar Tembhare");
		input.add(106.78f);
		input.add(45.0212);
		
		System.out.println(input);
		
		// Creating the object of the Stack class 
		Stack stack=new Stack();
		
		// adding elemrnt by using push method
		stack.push("Ashik");
		stack.push(45);
		stack.push(4587.0125);
		stack.push(106.45f);
		stack.push('A');
		// print the data 
		System.out.println(stack);
		
		// adding another data 
		stack.push("Shri");
		System.out.println(stack);
		
		
		
		
		
	}

}
