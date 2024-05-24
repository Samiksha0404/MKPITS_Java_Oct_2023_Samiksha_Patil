package com.mkpits.collection;

public class PrintBothData3 {

	public static void main(String[] args) {
		Integer[] intArr = {1,2,3,456,77,7};
		PrintIntegerArray1 array1 = new PrintIntegerArray1();
		array1.print(intArr);

		
		String[] str = {"bird","cat","dog"};
		PrintStringArray2 array2 = new PrintStringArray2();
	       array2.print(str);	
	}

}
