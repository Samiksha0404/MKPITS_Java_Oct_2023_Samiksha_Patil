package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class Example4_RemoveMethod {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();

		// Adding elements to the object
		// Custom inputs
		al.add("Samiksha");
		al.add("Patil");

		// Adding For at 1st indexes
		al.add(1, "Sandesh");

		
	System.out.println("the initial list is "+al);
	
	//remove element from the above list
	// present at 1st index
	al.remove(1);
	System.out.println("After removal of index 1 "+al);
	
	al.remove("Samiksha");
	System.out.println(al);
	System.out.println("the index of patil is "+al.indexOf("Patil"));
	
	
//	al.removeAll(al);
//	System.out.println(al);
//	System.out.println(al.isEmpty());
	}

}
