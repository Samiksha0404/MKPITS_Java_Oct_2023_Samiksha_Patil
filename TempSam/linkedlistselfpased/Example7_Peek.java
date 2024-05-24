package com.mkpits.linkedlistselfpased;

import java.util.LinkedList;

public class Example7_Peek {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
	    l1.add("happy");
	    l1.add("birth");
	    l1.add("day");
	    l1.add("harsh");
	    System.out.println("First element LinkedList:" + l1.peek()); 
	    //This method retrieves but does not remove, the head (first element) of this list.
     
	    System.out.println("First element of  LinkedList:" + l1.peekFirst()); 
	    //This method retrieves, but does not remove, 
	    //the first element of this list, or returns null if this list is empty.
	    
	    System.out.println("last element of  LinkedList:" + l1.peekLast()); 
	    //This method retrieves, but does not remove,
	    //the last element of this list, or returns null if this list is empty.
	    
	}

}
