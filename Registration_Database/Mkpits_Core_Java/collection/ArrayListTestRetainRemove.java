package com.mkpits.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTestRetainRemove {

	public static void main(String[] args) {
		
		List<String>flowerName=new ArrayList<String>();
		if(flowerName.isEmpty())
		{
			flowerName.add("Gendaful");
			flowerName.add("Chameli");
			flowerName.add("Champa");
		}
		
		List<String>flower=new ArrayList<String>();
		if(flower.isEmpty())
		{
			flower.add("Gulab");
			flower.add("Champa");
			flower.add("Juhi");
			flower.add("Suryaful");
			flower.add("Gendaful");
		}
		
		System.out.println("FlowerName ---> ");
		for (String string : flowerName) {
			System.out.println(string);
		}
		
		System.out.println("\nFlower --->");
		for (String string : flower) {
			System.out.println(string);
		}
		
		// addAll method to add both array list 1 and 2
		
		System.out.println("\n Flower List After Add All-->");
		flowerName.addAll(flower);
		for (String string : flowerName) {
			System.out.println(string);
		}
		
		// remove All method 
		
//		System.out.println("\nArray List Remove All Method");
//		flowerName.removeAll(flower);
//		for (String string : flowerName) {
//			System.out.println(string);
//		}
		
		// retainAll method 
		System.out.println("\nArrayList after Retain all --->");
		flower.retainAll(flowerName);
		for (String string : flower) {
			System.out.println(string);
		}

	}

}
