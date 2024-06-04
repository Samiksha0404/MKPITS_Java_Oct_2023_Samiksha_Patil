package com.mkpits.exception;

public class UseOfCatch {

	public static void main(String[] args) {
	try {
		int x = 10, y=0;
		System.out.println(x/y);
	}catch (Exception e) {
		System.out.println("Network Error");
		//we can print desire msg as error or exception
	}

	 try {
		 System.out.println("hello");
	 }finally {
		 System.out.println("hi");
	 }
	}

}
