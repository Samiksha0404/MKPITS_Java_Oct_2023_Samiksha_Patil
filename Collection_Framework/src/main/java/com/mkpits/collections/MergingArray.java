package com.mkpits.collections;

import java.util.ArrayList;

public class MergingArray {

	public static void main(String[] args) {
ArrayList<Integer> arr1 = new ArrayList<Integer>();
arr1.add(23);
arr1.add(21);
arr1.add(43);
arr1.add(893);
arr1.add(231);
ArrayList<Integer> arr2 = new ArrayList<Integer>();
arr2.add(89);
arr2.add(834);
arr2.add(839);
arr1.addAll(arr2);
System.out.println(arr1);

	}

}
