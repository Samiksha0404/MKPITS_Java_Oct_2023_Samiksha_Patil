package com.mkpits.nestedclass;

public class OuterClass {
	int x = 10;
	
public	class innerclass{
	int y = 20;
	int sum = x+y;
	
	}
class AnotherInnerClass{
	
	int a = 67;
	 public void getData() {
		 System.out.println("this is inner class method ");
	 }
}
}
