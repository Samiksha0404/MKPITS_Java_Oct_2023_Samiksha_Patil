package com.mkpits.nestedclass;

public class OuterClass {
	int x = 10;
	
//we can create a class inside another class  and call the inner class method	
class AnotherInnerClass{
	
	int a = 67;
	int sum = x + a;
	 public void getData() {
		 System.out.println("this is inner class method ");
		 System.out.println(sum);
		 
	 }
class InnerClass{
	void getDetails() {
		System.out.println("I m inner class method");
	}
}
}
}
