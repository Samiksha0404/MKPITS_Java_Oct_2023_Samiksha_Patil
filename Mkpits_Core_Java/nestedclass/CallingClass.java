package com.mkpits.nestedclass;

public class CallingClass {

	public static void main(String[] args) {
		
		// create obj of the outerclass
		NestedOuterClass nestedOuterClass=new NestedOuterClass();
		// create innner class obj
		NestedOuterClass.NestedInnerClass innerClass=nestedOuterClass.new NestedInnerClass();
		
		// calling method of inner class
		innerClass.getData();


	}

}
