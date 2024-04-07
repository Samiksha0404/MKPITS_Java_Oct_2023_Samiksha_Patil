package com.mkpits.collection;

import java.util.LinkedList;

public class LinkedListElementMethod {

	public static void main(String[] args) {
		
		// creating the object of the linkedlist 
		LinkedList<Integer>serialNo=new LinkedList<Integer>();
		
		// adding data into linked list by add method
		serialNo.add(256);
		serialNo.add(257);
		serialNo.add(258);
		serialNo.add(259);
		serialNo.add(210);
		serialNo.add(211);
		
		// element used to get first element from linked list
		System.out.println(serialNo.element());

	}

}
