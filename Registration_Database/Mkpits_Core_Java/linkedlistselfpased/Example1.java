package com.mkpits.linkedlistselfpased;

import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {
	
		LinkedList<String> l1 = new LinkedList<String>();
		
		l1.add("Bird");
		
		l1.add("beautifully");
		l1.addFirst("sing");
		//This method Inserts the specified element at the beginning of this list.
		
		l1.addLast("Song");
		//This method Appends the specified element to the end of this list.
		
		
		l1.add(2,"wow");
		
		System.out.println(l1);
		
		l1.remove();
		//This method retrieves and removes the head (first element) of this list.
		System.out.println(l1);
		
		l1.remove("beautifully");
		System.out.println(l1);
		
		l1.remove(2);
		//This method removes the element at the specified position in this list.
		System.out.println(l1);
		
		l1.removeFirst();
		//This method removes and returns the first element from this list.
		System.out.println(l1);
		
		l1.removeLast();
		//This method removes and returns the last element from this list.
		System.out.println(l1);
	}

}
