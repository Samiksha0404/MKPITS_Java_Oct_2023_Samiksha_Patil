package com.mkpits.collection;

public class PrintArray4 <T> {
	public void print(T[] test) {
		for (T t : test) {
			System.out.println(t);
			
		}
	}

	public static void main(String[] args) {

		Integer[] intArr = {1,33,45,3,2,4,31};
		String[] strArr = {"Raj","Harsh","vinay","Shree sir","samiksha"};
		
		PrintArray4<Integer> arr4 = new PrintArray4<Integer>();
		arr4.print(intArr);
		
		PrintArray4<String> arr5 =  new PrintArray4<String>();
		arr5.print(strArr);
	}

}
