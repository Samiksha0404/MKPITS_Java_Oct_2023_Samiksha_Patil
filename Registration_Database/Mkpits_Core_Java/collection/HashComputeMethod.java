package com.mkpits.collection;

import java.util.HashMap;

public class HashComputeMethod {

	public static void main(String[] args) {
		
		HashMap<String, String>map=new HashMap<String, String>();
		map.put("Name", "Ashik");
		
		System.out.println("Orignal Map Key Value ----->"+map);
		
		//Attempts to compute a mapping for the specified key and its currentmapped value
		map.compute("Name",(k,v)->v.replace("Ashik", "Ashikkumar"));
		System.out.println("New Updated Value ----->"+map);
		
		
	}

}
