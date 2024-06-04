package com.mkpits.collectiongeneric;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddAllMethod {

	public static void main(String[] args) {
		
		System.out.println("Names List 1---->");
		// creating object of the Listinterface
		// implemeted by arraylist class
		
		List<String> nameList1= new ArrayList<String>();
		
		// adding elements to obj of list ionterface
		nameList1.add("Ashik");
		nameList1.add("Pranav");
		nameList1.add("Raj");
		
		System.out.println("Names List 2---->");
		// creating obj of list interface by implementing ArrayList Class
		List<String> nameList2= new ArrayList<String>();
		
		// adding data manually
		nameList2.add("Samiksha");
		nameList2.add("Sanket");
		nameList2.add("Vaibhav");
		
		// addAll method add item after last item of list1
//		nameList1.addAll(nameList2);
//		System.out.println(nameList1);
		
		// Inserts all of the elements in the specified collection into this list at the specified position 
		//Shifts the element currently at that position (if any) and any sub sequent elements to the right 
		nameList1.addAll(2, nameList2);
		System.out.println("After Adding List2 into List1 :"+nameList1);
		
		
		
		
		

	}

}
