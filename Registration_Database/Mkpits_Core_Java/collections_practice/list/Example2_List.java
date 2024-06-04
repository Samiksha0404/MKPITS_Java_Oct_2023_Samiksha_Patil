package com.mkpits.collections_practice.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2_List {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		int[]array1= {1,2,3,4,5,6,7,8};
		String []array2= {"Ashik","Pranav","Sam"};
		
		list.add(array1);
		list.add(array2);
		
		System.out.println("Two Arrays Values ------>"+list);

		// we can store the arrays but the output will be in some address form 
		// because collection add data in the form of object
		
		printArrays(list); // creating method
	}

	// to itrate the arrays from list you need to use instanceof and typecast the number 
	private static void printArrays(List list) 
	{
		
		for (Object object : list) 
		{
			if(object instanceof int[])
			{
				int[]num=(int[])object;
				for (int n : num) {
					System.out.println(n);
				}
			}
			else if(object instanceof String[])
			{
				String[]names=(String[])object;
				for (String n : names) {
					System.out.println(n);
				}
			}
			
			
		}
		
	}
	
	


}
