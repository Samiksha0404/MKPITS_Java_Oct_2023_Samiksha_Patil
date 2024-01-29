package com.mkpits.linkedlistselfpased;

import java.util.LinkedList;

public class Example2_set {

	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		l1.add("hello");
		l1.add("hi");
		l1.add("world");
		
		l1.set(1, "to");
		//This method replaces the element at the specified position in this list
		//with the specified element.
		System.out.println(l1);
		
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("harsh");
		l2.add("is");
		l2.add("pig");
		
		l1.addAll( l2);
		//This method add all element in this list.

		System.out.println(l1);
		
		System.out.println(l2.contains("pig"));
		//This method returns true if this list contains the specified element.
		
		System.out.println(l1.indexOf("pig"));
		//This method returns the element at the specified position in this list.
		
		System.out.println(l1.getFirst());
		//This method returns the first element in this list.
		
		System.out.println(l1.getLast());
		//This method returns the last element in this list.
		
		System.out.println(l1.element());
        //This method retrieves but does not remove, the head (first element) of this list.
		
		//System.out.println(l1.toString());

	}

}
