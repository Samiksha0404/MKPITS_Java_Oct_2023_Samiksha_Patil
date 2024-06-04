package com.mkpits.collection;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayLIstReplaceWithValue {

	public static void main(String[] args) 
	{
		
		List<String>car=new ArrayList<String>();
		car.add("BMW");
		car.add("Mercedies");
		car.add("Porche");
		
		for (String string : car) 
		{
			System.out.println(string);
		}
		 car.remove("BMW"); // remove the item 

		 System.out.println("\nAfter Removing The Item---->");
		 for (String string : car) {
			System.out.println(string);
		}
	}

}
