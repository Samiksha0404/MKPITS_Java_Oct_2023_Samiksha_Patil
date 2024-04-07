package com.mkpits.collections_practice.list;

import java.util.AbstractQueue;
import java.util.PriorityQueue;

public class AbstractQueue_Example1 {

	public static void main(String[] args) {
		
		AbstractQueue<Integer>rollNum=new PriorityQueue<Integer>();
		rollNum.add(100);
		rollNum.add(11);
		rollNum.add(45);
		rollNum.add(70);
		rollNum.add(40);
		rollNum.add(15);
		
		
		System.out.println("Roll Number----->"+rollNum);
		
		System.out.println("Poll element --->"+rollNum.poll());
		System.out.println(rollNum);

	}

}
