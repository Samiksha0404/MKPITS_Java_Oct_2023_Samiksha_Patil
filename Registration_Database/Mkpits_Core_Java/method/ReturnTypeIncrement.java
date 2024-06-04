package com.mkpits.method;

public class ReturnTypeIncrement {
   int value = 56;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTypeIncrement obj = new ReturnTypeIncrement();
		System.out.println(obj.returnValue(obj.value));
		System.out.println(obj.returnValue(obj.value));
		System.out.println(obj.returnValue(obj.value));
		System.out.println(obj.returnValue(obj.value));
 // same value will be printed
		// no increment will take place once value is printed even if we print value multiple times
		

	}
	private int returnValue(int a) {
		// TODO Auto-generated method stub
		
		++a;
		
		// when we have return type method the value will increment once and it will allocate in the memory
		//even if we print the value multiple times the output will be what is saved in main memory
		// it does not increment every time we print
		return a;
		
	}

}
