package com.mkpits.collectiongeneric;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIstRemoveMethod {

	public static void main(String[] args) {
		
		List<String>cars=new ArrayList<String>();
		cars.add("BMW");
		cars.add("TATA");
		cars.add("Lambo");
		
		cars.add(0, "Mahindra");
		
		System.out.println("Initial ArrayList--> "+cars);
		
		// remove the element by index
		cars.remove(1);
		System.out.println("Removing ArrayList by given index--> "+cars);
		
		// add item on index 
		cars.add(1, "Thar");
		System.out.println("Added new Car --> "+cars);
		
		// removing the item by putting value 
		cars.remove("Thar");
		System.out.println("Removing item after--> "+cars);
		

	}

}
