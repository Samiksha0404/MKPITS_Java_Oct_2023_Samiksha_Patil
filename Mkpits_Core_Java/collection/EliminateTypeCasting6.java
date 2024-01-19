package com.mkpits.collection;

import java.util.ArrayList;

public class EliminateTypeCasting6 {

	public static void main(String[] args) {
		Integer[] intArray = new Integer[10];
		intArray[0] = 110;
		int var = intArray[0];
		
		System.out.println(intArray.length);
		
		
		//in non generic version we need to do type casting
		
		ArrayList  list = new ArrayList();
		// in this non generic all type of data type we can store 
		list.add(223);
		
		int var2 = (int) list.get(0);// here we need to typecast because we cannot store object in any datatype without type casting
   
		list.add("hello");
		String str = (String) list.get(1);
		System.out.println(var);
		System.out.println(var2);

		//In Generic version no need to typecast
		ArrayList<Double> doubleArr = new ArrayList<Double>();
		doubleArr.add(232.34);
		double d = doubleArr.get(0);
		System.out.println(d);
	}

}
