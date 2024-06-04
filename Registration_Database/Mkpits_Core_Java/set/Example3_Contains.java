package com.mkpits.set;

import java.util.HashSet;
import java.util.Set;

// Accessing the Elements of the Set object 

public class Example3_Contains {

	public static void main(String[] args) {
		  Set<String> hs = new HashSet<String>(); 
		  
	        // Elements are added using add() method 
	        // Later onwards we will show accessing the same 
	  
	        // Custom input elements 
	        hs.add("A"); 
	        hs.add("B"); 
	        hs.add("C"); 
	        hs.add("A"); 
	  
	     // Declaring a string 
	        String check = "D"; 
	        
	        System.out.println("set contains  rf"+check+" "+hs.contains(check));
	}

}
