package com.mkpits.method;

public class IncrementMethod {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int value = 56;
		IncrementMethod obj = new IncrementMethod();
		
        //System.out.println(obj.returnValue(obj.value));
		// we cannot print method if the method has void return type it will show error

 // same value will be printed
		// no increment will take place once value is printed even if we print value multiple times
		obj.returnValue(value);
		

	}
	private void returnValue(int a) {
		// TODO Auto-generated method stub
		for(int i= a ; i<59 ;i++)
		// ++a;
		 System.out.println(i);
		 //since in void method we are not returning any value therefore we have to print it inside the method
		 
		 
		 
		
		
		// when we have return type method the value will increment once and it will allocate in the memory
		//even if we print the value multiple times the output will be what is saved in main memory
		// it does not increment every time we print

		
	}

}
