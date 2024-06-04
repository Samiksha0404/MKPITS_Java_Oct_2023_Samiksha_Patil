package com.mkpits.method;

public class ReturntypeMethodIncrement {


   int value = 56;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturntypeMethodIncrement obj = new ReturntypeMethodIncrement();
		obj.value = obj.returnValue(obj.value);
		System.out.println(obj.value);
		obj.value = obj.returnValue(obj.value);
		System.out.println(obj.value);
		obj.value = obj.returnValue(obj.value);
		System.out.println(obj.value);
		obj.value = obj.returnValue(obj.value);
		System.out.println(obj.value);
		
		
 // for value to increment we need to call the non static variable using obj and 
		//then call method and pass the same variable with obj as argument and then print it
		
	
		

	}
	private  int returnValue(int a) {
		// TODO Auto-generated method stub
		
		++a;
		
		// when we have return type method the value will increment once and it will allocate in the memory
		//even if we print the value multiple times the output will be what is saved in main memory
		// it does not increment every time we print
		return a;
		
	}

}
