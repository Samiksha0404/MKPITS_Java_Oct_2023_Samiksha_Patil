package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackTrimToSize {

	public static void main(String[] args) throws NumberFormatException, IOException {


		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer>stack=new Stack<Integer>();
	
		System.out.println("Enter the Stack Number Element");
		for (int i = 0; i < 7; i++) {
			stack.add(Integer.parseInt(br.readLine()));
			
		}
		
		System.out.println("Original Stack--->"+stack);
		
		System.out.println("Capacity of stack----->"+stack.capacity());
		
		//Increases the capacity of this vector, if necessary
		stack.ensureCapacity(15);
		System.out.println("Updated Capacity of stack----->"+stack.capacity());
		
		// This method is used to trim an Stack instance to the number of elements it contains.
		stack.trimToSize();
		System.out.println("Trim the size of the stack----->"+stack.capacity());

	}

}
