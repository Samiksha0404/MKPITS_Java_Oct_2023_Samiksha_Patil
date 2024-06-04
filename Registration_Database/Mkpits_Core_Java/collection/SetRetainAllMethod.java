package com.mkpits.collection;

import java.util.HashSet;
import java.util.Set;

public class SetRetainAllMethod {

	
		
		public static void main(String[] args) {

			Set<String> nameList1 = new HashSet<String>();
			nameList1.add("Ashik");
			nameList1.add("Raj");
			nameList1.add("Kaustubh");
			nameList1.add("Pranav");

			System.out.println("List 1------>" + nameList1);

			Set<String> nameList2 = new HashSet<String>();
			nameList2.add("Ashik");
			nameList2.add("Karan");
			nameList2.add("Vaibhav");
			nameList2.add("Pranav");
			nameList2.add("Pra");

			System.out.println("List 2------>" + nameList2);

			//Retains only the elements in this set that are contained in the specified collection 
			nameList1.retainAll(nameList2);
			System.out.println("Updated List 1------>" + nameList1);
		

	}

}
