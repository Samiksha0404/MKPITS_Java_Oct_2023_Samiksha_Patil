package com.mkpits.collections_practice.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;



public class PriorityQue_Example1 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer>pQueue=new PriorityQueue<Integer>();
		pQueue.add(100);
		pQueue.add(10);
		pQueue.add(45);
		pQueue.add(1);
		pQueue.add(98);
		pQueue.add(2);

		
		System.out.println(pQueue);
		
		Iterator<Integer>list=pQueue.iterator();
		
		while (list.hasNext()) 
		{
			System.out.println(list.next());
		}
		
	}

}
