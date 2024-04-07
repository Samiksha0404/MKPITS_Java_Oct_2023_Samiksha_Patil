package com.mkpits.collectiongeneric;

import java.util.ArrayList;

public class EliminatesTypeCast {

	public static void main(String[] args) {
		
		// integer class value
		Integer[] intArr = new Integer[10];
		intArr[0] = 10;
		int v = intArr[0];

		System.out.println(intArr.length);

		// In Non Generic version we have to typecast
		ArrayList list = new ArrayList();
		list.add(10);
		int v1 = (Integer) list.get(0);// returns object and object cant assign to primitive data type directly

		list.add("mkpits");
		String str = (String) list.get(1);

		// Generic version no need to typecast
		ArrayList<Double> doubleArr = new ArrayList<Double>();
		
		doubleArr.add(23.78);
		double d = doubleArr.get(0);

	}

}
