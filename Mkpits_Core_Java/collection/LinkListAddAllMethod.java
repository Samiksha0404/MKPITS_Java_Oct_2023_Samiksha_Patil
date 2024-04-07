package com.mkpits.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkListAddAllMethod {

	public static void main(String[] args) {
		
		List<String> name=new LinkedList<String>();
		name.add("Ashik");
		name.add("Shi");
		name.add("Pranav");
		name.add("Raj");

		List<Integer>cityCode=new LinkedList<Integer>();
		cityCode.add(440023);
		cityCode.add(440022);
		
		// name.addAll(cityCode);
		
		List<String>cityName =new LinkedList<String>();
		cityName.add("Nagpur");
		cityName.add("Pune");
		
		// addAll method append all the data at last
		name.addAll(cityName);
		
		// print data
		System.out.println("Added data in name -->"+name);
		
		// adding data by indexing
		cityName.addAll(0, name);
		
		System.out.println("Added List In City Name --> "+cityName);
		
		
		
	}

}
