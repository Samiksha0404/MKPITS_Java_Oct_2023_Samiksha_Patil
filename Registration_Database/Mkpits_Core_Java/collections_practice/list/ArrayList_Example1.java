package com.mkpits.collections_practice.list;

import java.util.ArrayList;

public class ArrayList_Example1 {

	public static void main(String[] args) {
		
		ArrayList<String>names=new ArrayList<String>();
		names.add("Ashik");
		names.add("Raj");
		names.add("Kunal");
		names.add("Pranav");
		names.add("Karan");
		names.add("Ashik");
		
		System.out.println("Original ArayList------>"+names);
		
		// removing first occurance of the list
		names.remove("Ashik");
		
		System.out.println("Updated Array List Data-----> "+names);
	}
}
