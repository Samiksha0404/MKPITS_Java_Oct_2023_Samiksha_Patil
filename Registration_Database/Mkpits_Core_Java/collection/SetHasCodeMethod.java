package com.mkpits.collection;

import java.util.HashSet;
import java.util.Set;

public class SetHasCodeMethod {
	
	public static void main(String[] args) {
		
		Set<Character>vowels=new HashSet<Character>();
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		
		//Returns the hash code value for this set. 
		System.out.println("Has Code :-"+vowels.hashCode());
	}

}
