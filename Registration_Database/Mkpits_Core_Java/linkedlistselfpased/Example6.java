package com.mkpits.linkedlistselfpased;

import java.util.LinkedList;

public class Example6 {

	public static void main(String[] args) {
		 LinkedList<Integer> list = new LinkedList<Integer>();
	 
	        
	        list.add(12);
	        list.add(4);
	        list.add(8);
	        list.add(10);
	        list.add(3);
	        list.add(15);
	        
	       list.offer(7);
	       //This method Adds the specified element as the tail (last element) of this list.
	        System.out.println("using offer "+list);
	        
	        list.offerFirst(78);
	        //This method Inserts the specified element at the front of this list.
	        System.out.println("after using offerfirst "+list);
	        
	        list.offerLast(90);
	        //This method Inserts the specified element at the end of this list.
	        System.out.println("after using offerlast "+list);
	}

}
