package com.mkpits.collections_practice.list;

import java.util.PriorityQueue;

public class PriorityQueue_Poll 
{

	public static void main(String[] args) 
	{
		// creating a obj of priorityqueue  
		PriorityQueue<Integer>num=new PriorityQueue<Integer>();
		num.add(45);
		num.add(40);
		num.add(88);
		num.add(85);
		num.add(50);
		
		System.out.println("Is Num Present----> "+num.contains(40));
		System.out.println("Queue--->"+num);
		
		System.out.println("Poll answer---->"+num.poll());
		
		System.out.println("Updated Queue--->"+num);

	}
	
}
