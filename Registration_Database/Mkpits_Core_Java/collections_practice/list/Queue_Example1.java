package com.mkpits.collections_practice.list;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Example1 {

	public static void main(String[] args) {
		
	
		Queue<Integer>queue=new PriorityQueue<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		
		System.out.println(queue);
		

	}

}
