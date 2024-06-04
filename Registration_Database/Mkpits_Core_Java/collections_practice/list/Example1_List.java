package com.mkpits.collections_practice.list;

import java.util.ArrayList;
import java.util.List;

public class Example1_List {

	public static void main(String[] args) {
		
		// non generic => it takes all type of data/ heterogeneous type of data
		// creating a obj of list interface by implementing arrayList class
		List list =new ArrayList();
		
		// adding a data in list by using add() method
		list.add(10); // int
		list.add(450.235);// double
		list.add("Ashik");// string
		list.add('A'); // char
		
		System.out.println("List Items ----->"+list);

	}

}
