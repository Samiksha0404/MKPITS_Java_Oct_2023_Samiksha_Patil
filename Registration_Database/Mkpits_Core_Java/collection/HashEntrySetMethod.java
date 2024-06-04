package com.mkpits.collection;

import java.util.HashMap;

public class HashEntrySetMethod {

	public static void main(String[] args) {

		HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
		map.put(1, 101);
		map.put(2, 151);
		map.put(3, 121);
		map.put(4, 17);
		map.put(5, 110);
		
		System.out.println("Map --------> "+map);
		System.out.println("Set --------> "+map.entrySet());

		

	}

}
