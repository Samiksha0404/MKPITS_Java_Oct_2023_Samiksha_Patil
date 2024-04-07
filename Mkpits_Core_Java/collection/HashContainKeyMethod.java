package com.mkpits.collection;

import java.util.HashMap;

public class HashContainKeyMethod {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String>map=new HashMap<Integer, String>();
		map.put(7, "Ashik");
		map.put(1, "Pranav");
		map.put(3, "Ashwini");
		map.put(10, "Raj");

		System.out.println("Size of the map------> "+map.size());
		// check the key is present or not 
		System.out.println(map.containsKey(7)?"Key Contain":"Key is not Contain");
		// output= key contain
	}

}
