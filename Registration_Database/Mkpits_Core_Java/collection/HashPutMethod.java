package com.mkpits.collection;

import java.util.HashMap;
import java.util.HashSet;

public class HashPutMethod {

	public static void main(String[] args) {
		
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
		//Associates the specified value with the specified key in this map
		map.put('A', 102);
		map.put('E', 102);
		map.put('C', 102);
		map.put('D', 102);
		map.put('B', 102);

		System.out.println("Items in HashMap------> "+map);
	}

}
