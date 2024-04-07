package com.mkpits.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListAddMethod {

	public static void main(String[] args) {
		
		// creating obj of the List interface by implementing LinkList class
		List list=new LinkedList();
		
		// add data manually
		list.add("Ashik");
		list.add(45);
		list.add('A');
		list.add(45.12f);
		
		// print the data
		System.out.println("Data--> "+list);
		
		// add data on index
		list.add(0, "Srhi"); // index=0, value=Shri
		list.add(5, "Ashik");
		
		// print the data
		System.out.println("Updated Data--> "+list);

	}

}
