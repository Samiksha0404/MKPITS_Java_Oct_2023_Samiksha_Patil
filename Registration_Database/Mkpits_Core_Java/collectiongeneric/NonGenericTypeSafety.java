package com.mkpits.collectiongeneric;

import java.util.ArrayList;
import java.util.List;

public class NonGenericTypeSafety {

	public static void main(String[] args) {
		
		// non generic 
		List list= new ArrayList();
		// add values 
		list.add("Ashik");
		list.add('A');
		list.add(45.25f);
		list.add(18);
		// print the list
		System.out.println(list);
		
		
	}

}
