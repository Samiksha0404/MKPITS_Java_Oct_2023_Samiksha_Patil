package com.mkpits.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListItemRevers {

	public static void main(String[] args) {
		
		List<String>names=new ArrayList<String>();
		names.add("Ashik");
		names.add("Pranav");
		names.add("Raj");
		names.add("Sanket");

		
		for (String name : names) 
		{
			System.out.println(name);
		}
		
		System.out.println("Revers List-->");
		
		for (int i =names.size()-1 ; i >=0; i--) 
		{
			System.out.println(names.get(i));
		}
	}

}
