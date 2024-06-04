package com.mkpits.collection;

import java.util.Stack;

public class StackPopMethod {

	public static void main(String[] args) {
		
		Stack<Integer>number=new Stack<Integer>();
		number.add(10);
		number.add(11);
		number.add(12);
		number.add(13);
		number.add(14);
		
		System.out.println("Orignal Number :"+number);
		
		System.out.println("Pop element :"+number.pop());

	}

}
