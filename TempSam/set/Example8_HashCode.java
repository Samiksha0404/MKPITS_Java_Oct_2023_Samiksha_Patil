package com.mkpits.set;

import java.util.HashSet;
import java.util.Set;

public class Example8_HashCode {

	public static void main(String[] args) {
		Set<Integer> arr = new HashSet<Integer>(); 
		  
        
        arr.add(11); 
        arr.add(20); 
        arr.add(23); 
        arr.add(49); 
  
        // print Set 
        System.out.println("Set: " + arr); 

     // Get the hashCode value 
        // using hashCode() value 
        System.out.println("hashCode value : "+arr.hashCode());
	}

}
