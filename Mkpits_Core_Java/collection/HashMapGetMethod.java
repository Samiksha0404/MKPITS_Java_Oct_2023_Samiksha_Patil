package com.mkpits.collection;

import java.util.HashMap;

public class HashMapGetMethod {

	public static void main(String[] args) {
		
		// creating object of the HashMap class 
		HashMap<Integer, String>map=new HashMap<>();
		map.put(440023, "Navneet Nagar Wadi");
		map.put(440022,"Hingna MIDC");
		map.put(441112, "Katol");
		map.put(441103, "Vikash Nagar");
		// Returns the value to which the specified key is mapped,or null if this map contains no mapping for the key. 
		System.out.println("Get the City Name :-----> "+map.get(440023));

	}

}
