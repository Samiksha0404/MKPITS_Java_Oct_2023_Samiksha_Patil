package com.mkpits.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDescendingIteraretor {

	public static void main(String[] args) {
	
		LinkedList<String>cityName=new LinkedList<String>();
		cityName.add("Nagpur");
		cityName.add("Pune");
		cityName.add("Nagpur");
		cityName.add("Aassam");
		cityName.add("Jharkhand");
		
		System.out.println(cityName);
		// Returns an iterator over the elements in this deque(reverse) in reverse sequential order
		Iterator name=cityName.descendingIterator();
		while (name.hasNext()) {
			System.out.println(name.next());
			
		}
		

	}

}
