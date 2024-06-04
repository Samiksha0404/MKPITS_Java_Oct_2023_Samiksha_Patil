package com.mkpits.set;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class Example7_Treeset {

	public static void main(String[] args) {
	

		
				 Set<String> h = new TreeSet<String>(); 
				  
			        // Adding elements into the LinkedHashSet 
			        // using add() 
			        h.add("India"); 
			        h.add("Australia"); 
			        h.add("South Africa"); 
			  
			        // Adding the duplicate 
			        // element 
			        h.add("India"); 
			  
			        // Displaying the tree set
			        System.out.println(h);
			     
			        // Removing items from tree set 
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


