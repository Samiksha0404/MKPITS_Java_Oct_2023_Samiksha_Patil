package com.mkpits.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TypeSafety5 {

	public static void main(String[] args) {

		Integer[] arr = new Integer[10];
		
		arr[0] = 4;
		arr[1] = 3;
	//	arr[2] = "hi";  // gives compiletime errror
		
		Integer i = 20;
		
		//instance of  : keyword checks where the variable belong from the particular class
		System.out.println(i instanceof Integer);
		
		//non Generic version
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("Raj");
		list.add(12.4f);
		list.add(true);
		
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
