package com.mkpits.collectiongeneric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortTest1 {

	public static void main(String[] args) {
		
		List<String>cricketPlayer=new ArrayList<String>();
		cricketPlayer.add("Zahir Khan");
		cricketPlayer.add("Aashish Nehra");
		cricketPlayer.add("Aashish ");
		cricketPlayer.add("Dhoni");
		cricketPlayer.add("Virat Kohli");
		cricketPlayer.add("Rohit Sharma");
		cricketPlayer.add("ms dhoni");
		
		// sort the list in ascending order
		Collections.sort(cricketPlayer);
		// print data 
		System.out.println(cricketPlayer);
		
		//Returns a comparator that imposes the reverse of the natural ordering on 
		//a collection of objects that implement the Comparable interface.
		Collections.sort(cricketPlayer, Collections.reverseOrder());
		System.out.println(cricketPlayer);
		
		
		
		
		

	}

}
