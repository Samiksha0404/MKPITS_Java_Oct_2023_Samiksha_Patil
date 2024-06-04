package com.mkpits.collections_practice.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_ReverseOrder {

	public static void main(String[] args) {
		
		LinkedList<String> book_list = new LinkedList<String>();
		book_list.add("Java");
		book_list.add("C");
		book_list.add("Cpp");
		book_list.add("Python");
		book_list.add("Php");
		book_list.add("Css");
		book_list.add("Html");
		book_list.add("MySql");
		System.out.println("linked list:" + book_list);
		//Returns an iterator over the elements in this deque in reversesequential order. 
		Iterator it = book_list.descendingIterator();
		System.out.println("Reverse Order:");
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
