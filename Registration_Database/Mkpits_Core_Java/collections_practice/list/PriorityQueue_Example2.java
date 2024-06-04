package com.mkpits.collections_practice.list;

import java.util.PriorityQueue;

public class PriorityQueue_Example2 {

	public static void main(String[] args) {
		
		PriorityQueue<String>queue=new PriorityQueue<String>();
		queue.add("Zaved");
		queue.add("ASHIK");
		queue.add("Samiksha");
		queue.add("Kaushtubh");
		queue.add("Zaved");

		System.out.println("Original--->"+queue);
		
		System.out.println("Head--->"+queue.peek());
		
		System.out.println("Delete The Head---->"+queue.poll());
		
		System.out.println("Updated Queue---->"+queue);
	}

}
