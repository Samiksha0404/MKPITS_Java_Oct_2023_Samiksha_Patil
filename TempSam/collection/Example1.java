package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
     List<Integer> list1 = new  ArrayList<Integer>();
      list1.add(0,12);// index 0 value is 12
      list1.add(1,13);// index 1 value is 13
      list1.add(2,14);// index 2 value is 14
      list1.add(3,15);// index 3 value is 15
      System.out.println(list1);
      
      List<Integer> list2 = new  ArrayList<Integer>();
      
      list2.add(1);//index 0
      list2.add(2);//index 1
      list2.add(3);//index 2
      list2.add(4);//index 3
      
      list1.addAll(3, list2);//list 2 will be added from 3 index in list1
      
      System.out.println(list1);
      
      System.out.println(list1.size());// to get the new size of list1

      System.out.println(list1.get(5));// Prints element at index 5 in list 1

      list1.set(3, 00);// Replace 3th element with 00
      System.out.println(list1);
      
      list1.remove(5);// Removes element from index 5
      System.out.println(list1);
      
      
      System.out.println(list1.contains(list2));
      
    /*  Operation 1: Adding elements to List class using add() method
//		Operation 2: Updating elements in List class using set() method
//		Operation 3: Searching for elements using indexOf(), lastIndexOf methods
//		Operation 4: Removing elements using remove() method
//		Operation 5: Accessing Elements in List class using get() method
//		Operation 6: Checking if an element is present in the List class using contains() method
     * */  
      
      
      
	}

}
