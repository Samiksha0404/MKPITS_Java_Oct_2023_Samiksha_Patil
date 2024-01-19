package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class Example5_GetMethod {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();

		// Adding elements to the object
		// Custom inputs
		al.add("Samiksha");
		al.add("Patil");

		// Adding For at 1st indexes
		al.add(1, "Sandesh");
		
		
		
		String first = al.get(0);//to get the element at index 0
		String second = al.get(1);//to get the element at index 1
		String third = al.get(2);//to get the element at index 2
		
		System.out.println("the element at first index is "+first);
		System.out.println("the element at second index is "+second);
		System.out.println("the element at third index is "+third);


		System.out.println(al);

	}

}
