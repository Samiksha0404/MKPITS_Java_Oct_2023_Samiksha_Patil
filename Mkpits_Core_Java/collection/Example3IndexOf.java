package com.mkpits.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example3IndexOf {

	public static void main(String[] args) {
		// create a list of integers
				ArrayList<Integer> list = new ArrayList<Integer>();

				// add some integers to the list
				list.add(10);
				list.add(20);
				list.add(50);
				list.add(40);
				list.add(50);

				// use indexOf() to find the first occurrence of an
				// element in the list
				
				int index = list.indexOf(50);
				System.out.println("the index of 50 :"+index);
				
				
				// use lastIndexOf() to find the last occurrence of
				// an element in the list
                int lastindexof = list.lastIndexOf(50);
                System.out.println("The last index of 50 "+lastindexof);
                
           ListIterator listitr =  list.listIterator() ;
           
           
           //forward iteration
           System.out.println("Forward Traversal");
           while(listitr.hasNext()) {
        	   System.out.println(listitr.next());
           }
         //backward iteration
           System.out.println("backward Traversal");
           while(listitr.hasPrevious()) {
        	   System.out.println(listitr.previous());
           }
           
           
           
           boolean result = list.get(4).equals(50);
           System.out.println(result);
           
           boolean con = list.contains(30);
           System.out.println(con);

	}

}
