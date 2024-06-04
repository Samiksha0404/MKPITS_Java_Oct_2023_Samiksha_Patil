package com.mkpits.collections_practice.list;

import java.util.ArrayList;

public class ArrayList_RemoveIf {

	public static void main(String[] args) {
		ArrayList<Integer>number=new ArrayList<Integer>();
		number.add(10);
		number.add(11);
		number.add(70);
		number.add(1102);
		number.add(9);
		number.add(20);
		
		System.out.println("Original ArrayList---->"+number);
		//Removes all of the elements of this collection that satisfy the givenpredicate
		number.removeIf(n->n%2!=0);
		System.out.println("Even Number List---->"+number);

	}

}
