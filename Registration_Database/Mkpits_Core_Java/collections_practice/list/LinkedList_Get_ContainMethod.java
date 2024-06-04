package com.mkpits.collections_practice.list;

import java.util.LinkedList;

public class LinkedList_Get_ContainMethod {

	public static void main(String[] args) {
		
		LinkedList<Integer>number=new LinkedList<Integer>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		System.out.println("Original Number------>"+number);
		System.out.println("Contain the Number------>"+number.contains(30));

	}

}
