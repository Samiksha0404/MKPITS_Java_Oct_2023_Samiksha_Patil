package com.mkpits.collections_practice.list;

import java.util.HashMap;
import java.util.Map;

public class HashMap_ValuesMethod 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String>cities=new HashMap<>();
		cities.put(440023, "Navneet Nagar");
		cities.put(441110, "Hingna");
		cities.put(441101, "Saoner");
		cities.put(441106, "Ramtek");
		cities.put(441104, "Mauda");
		cities.put(441305, "Bhiwapur");
		
		System.out.println("Map ----->"+cities);
		//Returns the value corresponding to this entry. 
		for (Map.Entry<Integer, String> entry : cities.entrySet()) 
		{
			
			System.out.println("Value--->"+entry.getValue());
			
		}
		

	}

}
