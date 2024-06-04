package com.mkpits.collections_practice.list;

import java.util.LinkedList;

public class LinkedList_PollMethod {

	public static void main(String[] args) {
		
		LinkedList<String>studName=new LinkedList<String>();
		studName.add("Ashik");
		studName.add("Karan");
		studName.add("Raj");
		studName.add("Rugved");
		studName.add("Pranav");
		// print the stud Name
		System.out.println("Original List---->"+studName);
		System.out.println("Deleted Name---->"+studName.pollFirst());
		System.out.println("Updated List------->"+studName);
		
		

	}

}
