package com.mkpits.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSetMethod {

	public static void main(String[] args) {
		

		// creating obj of the list interface
		// implementing class Linked List
		List<String> name=new LinkedList<String>();
		name.add("Ashik");
		name.add("Shi");
		name.add("Pranav");
		name.add("Raj");
		
		// creating another obj of list interface
		// by implementing ArrayList class
		List<String>cityName =new ArrayList<String>();
		cityName.add("Nagpur");
		cityName.add("Pune");
		
		// addAll data into last in specific collection
		//Appends all of the elements in the specified collection to the end ofthis list,
		name.addAll(cityName);
		
		System.out.println("Update data in name list -->"+name);
		// adding data on idex 0 
		cityName.addAll(0, name);
		System.out.println("Updated City Name------>");
		for (String cn : cityName) 
		{
			System.out.println(cn);
		}
		
		// setAll method used to replace the data in list present in specific index
		cityName.set(cityName.lastIndexOf("Nagpur"), "Mumbai"); // lastIndexOf method used to get last occerance index of the value
		cityName.set(cityName.indexOf("Pune"),"Yavtmal");// Returns the index of the first occurrence of the specified element
		
		System.out.println("Replaced Name --> "+cityName);
		
		
		
		
		
		

	}

}
