package com.mkpits.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example6_LinkedHashSet {

	public static void main(String[] args) {
		 Set<String> h = new LinkedHashSet<String>(); 
		  
	        // Adding elements into the LinkedHashSet 
	        // using add() 
	        h.add("India"); 
	        h.add("Australia"); 
	        h.add("South Africa"); 
	  
	        // Adding the duplicate 
	        // element 
	        h.add("India"); 
	  
	        // Displaying the LinkedHashSet 
	        System.out.println(h);
	     
	        // Removing items from LinkedHashSet 
	        // using remove() 
	        h.remove("Australia"); 
	        System.out.println("Set after removing "
	                           + "Australia:" + h); 
	  
	        // Iterating over linked hash set items 
	        System.out.println("Iterating over set:"); 
	        Iterator<String> i = h.iterator(); 
	        while (i.hasNext()) 
	            System.out.println(i.next()); 
	  

	}

}
