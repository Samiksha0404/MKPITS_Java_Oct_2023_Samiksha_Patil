package com.mkpits.collection;

import java.util.Stack;

public class StackSearchMethod {

	public static void main(String[] args) {
		
		Stack<Integer> num=new Stack<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		//in Java is used to search for an element in the stack and get its distance from the top. 
		// if elements is absent it will return -1
		// search method start the distancing fromm 1 not from 0
		System.out.println(num.search(30));

	}
}