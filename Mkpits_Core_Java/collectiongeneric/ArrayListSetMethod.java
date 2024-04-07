package com.mkpits.collectiongeneric;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSetMethod {

	public static void main(String[] args) {
		
		// creating object of interface implementing the ArrayList class
		List<String>cityName=new ArrayList<String>();
		cityName.add("Nagpur");
		cityName.add("Aurangabad");
		cityName.add("Mumbai");
		System.out.println("Befor Update-->"+cityName);
		// adding city on the inpiut index 
		// remaining data will be shifted by left to right or up to down
		cityName.add(2, "Pune");
		
		// print the city name 
		System.out.println("After Update--> "+cityName);
		
		//Replaces the element at the specified position in this list with the specified element 
		cityName.set(1, "Nagar");
		System.out.println("Update City Name-->"+cityName);

	}

}
