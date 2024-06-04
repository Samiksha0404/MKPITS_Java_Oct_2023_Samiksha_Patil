package com.mkpits.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayReverseOrderByMethod {

	public static void main(String[] args) {
		
		List<String>names=new ArrayList<String>();
		names.add("Ashik");
		names.add("Pranav");
		names.add("Raj");
		names.add("Sanket");

		// reverse method revers the list 
		Collections.reverse(names);

		// print array
		for (String string : names) {
			System.out.println(string);
		}
	}

}
