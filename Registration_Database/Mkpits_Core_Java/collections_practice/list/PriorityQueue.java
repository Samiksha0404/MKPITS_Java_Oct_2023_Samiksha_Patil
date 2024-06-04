package com.mkpits.collections_practice.list;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {

	public static void main(String[] args) {
		
		Queue<String>queue=new LinkedList<String>();
		queue.add("Zaved");
		queue.add("Samir");
		queue.add("Ashik");
		queue.add("Pranav");
		queue.add("Zaved");
		queue.add("Raj");

		System.out.println(queue);
	}

}
