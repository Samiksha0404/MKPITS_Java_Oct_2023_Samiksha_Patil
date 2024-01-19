package com.mkpits.collection;

import java.util.ArrayList;

public class Example3IndexOf {

	public static void main(String[] args) {
		// create a list of integers
				ArrayList<Integer> list = new ArrayList<Integer>();

				// add some integers to the list
				list.add(10);
				list.add(20);
				list.add(50);
				list.add(40);
				list.add(50);

				// use indexOf() to find the first occurrence of an
				// element in the list
				
				int index = list.indexOf(50);
				System.out.println("the index of 50 :"+index);
				
				
				// use lastIndexOf() to find the last occurrence of
				// an element in the list
                int lastindexof = list.lastIndexOf(50);
                System.out.println("The last index of 50 "+lastindexof);

	}

}
