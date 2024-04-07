package com.mkpits.collection;

import java.util.Stack;

public class StackCapacityMethod {

	public static void main(String[] args) {
		
		Stack<String>studentNames=new Stack<String>();
		studentNames.add("Ruggu");
		
		//Returns the current capacity of this vector.
		System.out.println("The Capacity of Stack is ----> "+studentNames.capacity());

	}

}
