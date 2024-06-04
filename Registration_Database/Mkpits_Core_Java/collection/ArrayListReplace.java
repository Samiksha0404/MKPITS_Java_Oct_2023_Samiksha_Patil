package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReplace {

	public static void main(String[] args) 
	{
		List<String>car=new ArrayList<String>();
		car.add("BMW");
		car.add("Mercedies");
		car.add("Porche");
		
		System.out.println("Before Replace--->");
		for (String cars : car) 
		{
			System.out.println(cars);
		}
		
		//Replaces the element at the specified position in this list with the specified element (optional operation).
		car.set(1, "TATA");
		
		System.out.println("After Replace--->");
		for (String string : car) 
		{
			System.out.println(string);
		}

	}

}
