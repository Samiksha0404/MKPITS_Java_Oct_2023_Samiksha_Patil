package com.mkpits.collections_practice.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedList_Add {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size");
		int size=Integer.parseInt(br.readLine());
		LinkedList<Integer>num=new LinkedList<Integer>();
		System.out.println("Enter The Number--->");
		for (int i = 0; i < size; i++) {
			num.add(Integer.parseInt(br.readLine()));
		}
		
		System.out.println("Original LinkedList------>"+num);
		System.out.println("Size of the ArrayList--->"+num.size());
		System.out.println("Enter the position And number");
		num.add(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
		
		System.out.println("Updated LinkedList------>"+num);
	}

}
