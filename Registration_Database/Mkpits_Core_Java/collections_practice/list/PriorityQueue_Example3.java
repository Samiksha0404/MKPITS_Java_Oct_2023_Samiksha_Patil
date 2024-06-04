package com.mkpits.collections_practice.list;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueue_Example3 {

	public static void main(String[] args) {
		
		LinkedList<Integer>number=new LinkedList<Integer>();
		number.add(1);
		number.add(3);
		number.add(5);
		number.add(2);
		number.add(0);
		
		PriorityQueue<Integer>num=new PriorityQueue<Integer>(number);
		System.out.println("Numbers in PriorityQueue--->"+num);
		
		

	}

}
