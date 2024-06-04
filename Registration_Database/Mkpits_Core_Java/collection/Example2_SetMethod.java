package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class Example2_SetMethod {

	public static void main(String[] args) {
     List<String> al = new ArrayList<>();
		
		al.add("Samiksha");
		al.add("patil");
		al.add(1,"@");
		
		//display the initial elements in List
		System.out.println("Initial ArrayList " + al);
		

		// Setting (updating) element at 1st index
		// using set() method
		al.set(1, "Sandesh");
		
		System.out.println("Updated ArrayList " + al);
	}

}
