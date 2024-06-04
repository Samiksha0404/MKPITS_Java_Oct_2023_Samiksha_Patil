package com.mkpits.unboundedgeneric;

public class UnBounded {

	public static void main(String[] args) {
      
		Integer intArr[] = {1,6,7,5,78,89};
		PrintData<Integer> printArray =  new PrintData<>();
		printArray.print(intArr);
		
		String str[]= {"hello","nishi","harsh","honesty"};
		PrintData<String> stringArr = new PrintData<String>();
		stringArr.print(str);
		
		Double doubleStr[] = {55.67,56.0,34.8,23.9,543.3};
		PrintData<Double> doubleArr  = new PrintData<Double>();
		doubleArr.print(doubleStr);
	}

}
