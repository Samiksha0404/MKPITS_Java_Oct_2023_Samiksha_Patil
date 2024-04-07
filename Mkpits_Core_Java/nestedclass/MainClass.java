package com.mkpits.nestedclass;



public class MainClass {

	public static void main(String[] args) 
	{
		OuterClass outerClass=new OuterClass();
		OuterClass.InnerClass innerClass=outerClass.new InnerClass();
		
		System.out.println("Addition Of the two Number from Outer Class and Inner Class :-"+outerClass.outerClassNumber+innerClass.innerClassNumber);

	}

}
