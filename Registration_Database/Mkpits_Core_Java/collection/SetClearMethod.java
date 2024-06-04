package com.mkpits.collection;

import java.util.HashSet;
import java.util.Set;

public class SetClearMethod {

	public static void main(String[] args) {
		
		// creating the obj of set by implementing hascode classs
		Set<String>cityName=new HashSet<String>();
		cityName.add("Nagpur");
		cityName.add("Pune");
		cityName.add("Nashik");
		
		System.out.println("City Name Present in Set :-----> "+cityName);
		System.out.println("Size of the Set------>"+cityName.size());
		cityName.clear(); //Removes all of the elements from this set
		System.out.println("Size of the Updated Set------>"+cityName.size());

	}

}
