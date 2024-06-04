package com.mkpits.collection;

import java.util.HashSet;
import java.util.Set;

public class SetToArrayMethod {

	public static void main(String[] args) {
		
		Set<Integer>pinCode=new HashSet<Integer>();
		pinCode.add(440023);
		pinCode.add(441111);
		pinCode.add(441113);
		pinCode.add(440020);
		
		System.out.println("Set Collection List ---->"+pinCode);
		
		System.out.println("Set pinCode converted into Array------>");
		// Integer[]ar=(Integer[]) pinCode.toArray(); // we can use like this also but we need to type cast
		Object[] arr=pinCode.toArray();
		for (Object obj : arr) 
		{
			System.out.println(obj);
		}
		System.out.println("Array index 2 value is "+arr[2]);

	}

}
