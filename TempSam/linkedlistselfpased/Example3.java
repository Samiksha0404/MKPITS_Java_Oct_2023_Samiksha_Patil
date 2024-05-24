package com.mkpits.linkedlistselfpased;

import java.util.LinkedList;

public class Example3 {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
	    l1.add("happy");
	    l1.add("birth");
	    l1.add("day");
	    l1.add("harsh");
	    System.out.println("First LinkedList:" + l1); 
	    
	    
	    LinkedList<String> l2 = new LinkedList<String>();
	    l2 = (LinkedList<String>) l1.clone();
	    //This method returns a shallow copy of this LinkedList.
	    
	    System.out.println("Second LinkedList is:" + l2); 
	    
	}

}
