package com.mkpits.collections_practice.list;

import java.util.ArrayList;

public class ArrayList_Set {

	public static void main(String[] args) {
		
		ArrayList<String>cityName=new ArrayList<String>();
		cityName.add("Nagpur");
		cityName.add("Nashik");
		cityName.add("Kanpur");
		cityName.add("Gondia");

		System.out.println("Original List------>"+cityName);
		cityName.set(cityName.indexOf("Kanpur"), "Chandrapur");
		
		System.out.println("Updated List----->"+cityName);
	}

}
