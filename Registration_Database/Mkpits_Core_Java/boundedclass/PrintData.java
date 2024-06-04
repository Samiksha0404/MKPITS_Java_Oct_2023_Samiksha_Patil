package com.mkpits.boundedclass;

public class PrintData <T extends Number> {
	//Number class will only limit the use of numbers in this class no string type data will be printed
	public void print(T arr[]) {
		for (T t : arr) {
			System.out.println(t);
		}
		
	}

}
