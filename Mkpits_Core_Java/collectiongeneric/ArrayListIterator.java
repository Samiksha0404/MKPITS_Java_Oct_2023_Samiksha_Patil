package com.mkpits.collectiongeneric;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		
		List<Integer>number=new ArrayList<Integer>();
		number.add(10);
		number.add(11);
		number.add(12);
		number.add(13);
		number.add(14);
		
		System.out.println(number);
		
		//ListIterator iterator=number.listIterator();
		ListIterator<Integer> iterator =number.listIterator();
		System.out.println("");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("Reverse The order---->");
		while(iterator.hasPrevious())
		{
			System.out.println(iterator.previous());
		}
		//List<String>name= {"Ashik","Pranav"};
		

	}

}
