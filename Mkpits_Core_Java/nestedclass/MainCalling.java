package com.mkpits.nestedclass;

import com.mkpits.nestedclass.OuterClass.AnotherInnerClass;
import com.mkpits.nestedclass.OuterClass.innerclass;

public class MainCalling {

	public static void main(String[] args) {
		OuterClass outer =  new OuterClass();//outer class object

		OuterClass.innerclass oi = outer.new innerclass();
		
		innerclass i=oi.new innerclass(); 
		//inner class object
		
		AnotherInnerClass obj = oi.new AnotherInnerClass();
		obj.getData();
	}

}
