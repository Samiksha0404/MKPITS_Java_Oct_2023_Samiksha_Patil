package com.mkpits.nestedclass;

import com.mkpits.nestedclass.OuterClass.AnotherInnerClass;
import com.mkpits.nestedclass.OuterClass.AnotherInnerClass.InnerClass;

public class MainCalling {

	public static void main(String[] args) {
		OuterClass outer =  new OuterClass();//outer class object

		
		AnotherInnerClass obj = outer.new AnotherInnerClass();
		// for calling second class method we have to call it by using the object of outer class
		obj.getData();
		
		
		OuterClass.AnotherInnerClass in = outer.new AnotherInnerClass();
		// another way of calling inner class method
		in.getData();
		
		InnerClass obj1 = obj.new InnerClass();
		//calling inner class method using the object of another nner class
		
	    obj1.getDetails();
	}

}
