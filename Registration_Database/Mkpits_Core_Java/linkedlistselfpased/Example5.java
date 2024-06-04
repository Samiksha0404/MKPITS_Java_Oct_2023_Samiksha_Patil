package com.mkpits.linkedlistselfpased;

import java.util.LinkedList;

public class Example5 {
	public static void main(String[] args) {
		
	LinkedList<String> l1 = new LinkedList<String>();
    l1.add("happy");
    l1.add("birth");
    l1.add("day");
    l1.add("harsh");
    l1.add("birth");
    
    System.out.println(  l1.removeFirst()); 
    //This method removes and returns the first element from this list.
    
    System.out.println(  l1.removeLast());
    //This method removes and returns the last element from this list.
    l1.removeLastOccurrence("birth");
    System.out.println(l1);
    //This method removes the last occurrence of the specified 
    //element in this list (when traversing the list from head to tail).
    
    l1.removeFirstOccurrence("day");
    System.out.println(l1);
    //This method removes the first occurrence of the specified element 
    //in this list (when traversing the list from head to tail).
    
}
}
