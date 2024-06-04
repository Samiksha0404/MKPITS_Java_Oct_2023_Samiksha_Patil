package com.mkpits.unboundedgeneric;
//T is formal type argument

public class PrintData <T> {
 public void print(T[] arr) {
	 for (T t : arr) {
		System.out.println(t);
	}
 }
}
