package com.mkpits.collection;

import java.util.Stack;

public class StackPushWithGeneric {

	public static void main(String[] args) {

		// creating the object of the List interface by implementing Stack class 
		Stack<Integer> intNum=new Stack<Integer>();
		intNum.push(10);
		intNum.push(45);
		intNum.push(852);
		intNum.push(789546);
		intNum.push(122);
		
		//Itrate element by using foreach
		for (Integer number : intNum) 
		{
			System.out.println(number);
		}
		
	}

}
