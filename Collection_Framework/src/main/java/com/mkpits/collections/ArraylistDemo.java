package com.mkpits.collections;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arrays = new ArrayList<Integer>(3);
		arrays.add(3);
		arrays.add(40);
		arrays.add(242);
		arrays.add(344);
System.out.println("list" +arrays);

ArrayList<String> arr1 = new ArrayList<String>(3);
arr1.add("sam");
arr1.add("samiksha");
arr1.add("harsh");

for (String s : arr1) {
	System.out.println("list of students "+s);
}


	}

}
