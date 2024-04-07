package com.mkpits.collections_practice.list;

import java.util.LinkedList;

public class LinkedList_peekMethod {

	public static void main(String[] args) {
		
		LinkedList<String>studName=new LinkedList<String>();
		studName.add("Ashik");
		studName.add("Karan");
		studName.add("Raj");
		studName.add("Rugved");
		studName.add("Pranav");
		// print the stud Name
		System.out.println("Original List---->"+studName);
		
		// getting first name
		System.out.println("First Name ---->"+studName.peekFirst());
		// getting last name
		System.out.println("Last Name ----->"+studName.peekLast());
		 
		
	}

}
