package com.mkpits.set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Java Program Demonstrating Operations on the Set 
//such as Union, Intersection and Difference operations  


public class Example2 {

	public static void main(String[] args) {
		
		// Creating an object of Set class  
        // Declaring object of Integer type 
		Set<Integer> a = new HashSet<Integer>();
		
		
		// Adding all elements to List
		a.addAll(Arrays. asList(new Integer[] {1,3,4,2,4,8,5,3}));
		
		// Again declaring object of Set class 
	      // with reference to HashSet 
		
		Set<Integer> b = new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {2,3,4,2,4,8,9,4,3,7,0,9}));
		
		
		// To find union 
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		 System.out.print("Union of the two Set"); 
	     System.out.println(union);
	     
	    // To find intersection 
	     Set<Integer> intersection = new HashSet<Integer>(a);
	     intersection.retainAll(b);
	     System.out.print("Intersection of the two Set"); 
	        System.out.println(intersection); 
	        
	        
	     // To find the symmetric difference 
	        Set<Integer> difference = new HashSet<Integer>(a);
	        difference.removeAll(b);
	        //set a mese jitne b element set b k h unko remove karna symmetric difference h
	        System.out.print("Difference of the two Set"); 
	        System.out.println(difference); 
	}

}
