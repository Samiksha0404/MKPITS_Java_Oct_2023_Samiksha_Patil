package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Exampl2Stringjoiner {

	public static void main(String[] args) {
		// Creating an object of List interface,
		// implemented by ArrayList class
		List<String> al = new ArrayList<>();
		
		al.add("Samiksha");
		al.add("patil");
		al.add(1,"@");
		
		System.out.println(al);
		
		
		StringJoiner joiner = new StringJoiner("S");
		joiner.add(al.get(0)).add(al.get(1));
		
		System.out.println(joiner);
/*Print all the elements inside the
     List interface object
*/
		
		System.out.println(al);

	}

}
