package com.mkpits.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Java program Demonstrating Creation of Set object 
//Using the Hashset class 

public class Example5_Hashset {

	public static void main(String[] args) {
		// Creating object of Set of type String 
        Set<String> h = new HashSet<String>(); 
        
        
     // Adding elements into the HashSet 
        // using add() method 
  
       
        h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
        
        // Adding the duplicate element 
        h.add("India"); 
        System.out.println(h); 
        
     // Removing items from HashSet 
        // using remove() method 
        h.remove("Australia");
        System.out.println("Set after removing "
                + "Australia:" + h);
        
     // Iterating over hash set items 
        System.out.println("Iterating over set:");
        Iterator<String> i  = h.iterator();
        while(i.hasNext())
        {  
        	System.out.println(i.next());
        }
	}

}
