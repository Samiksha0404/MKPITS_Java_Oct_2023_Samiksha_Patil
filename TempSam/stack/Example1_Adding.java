package com.mkpits.stack;

import java.util.Stack;

public class Example1_Adding {

	public static void main(String[] args) {

		// Java program to add the
		// elements in the stack
		

				// Default initialization of Stack
				Stack stack1 = new Stack();

				// Initialization of Stack
				// using Generics
				Stack<String> stack2 = new Stack<String>();

				// pushing the elements
				stack1.push("hello");
				stack1.push("to");
				stack1.push("all");

				stack2.push("namste");
				stack2.push("to");
				stack2.push("all");

				// Printing the Stack Elements
				System.out.println(stack1);
				System.out.println(stack2);

	}

}
