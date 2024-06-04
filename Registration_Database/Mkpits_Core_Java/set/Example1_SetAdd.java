package com.mkpits.set;

import java.util.HashSet;
import java.util.Set;

public class Example1_SetAdd {

	public static void main(String[] args) {
		Set<String> hash_Set = new HashSet<String>(); 
		  
        // Adding elements to the Set 
        // using add() method 
        hash_Set.add("harsh"); 
        hash_Set.add("is"); 
        hash_Set.add("donkey"); 
        hash_Set.add("and "); 
        hash_Set.add("is"); 
        hash_Set.add("kaliya"); 
        
        System.out.println(hash_Set); 

	}

}
