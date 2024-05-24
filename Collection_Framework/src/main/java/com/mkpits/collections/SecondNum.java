package com.mkpits.collections;
//add element on second index
import java.util.ArrayList;
import java.util.List;

public class SecondNum {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(23);
		arr.add(23);
		arr.add(35);
		arr.add(12);
		arr.add(9);
		arr.add(56);
		 
		System.out.println(arr);
		
		arr.set(1, 78);
		
		System.out.println(arr);
		

	}

}
