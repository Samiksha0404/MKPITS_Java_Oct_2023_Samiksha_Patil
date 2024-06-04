package com.mkpits.nestedclass;

public class NestedOuterClass {
	
	// private member of the outer class
	private float PI=3.14f;
	
	class NestedInnerClass
	{
		void getData()
		{
			// calling directly outer class private member 
			System.out.println("Outer Block Pi Value :"+PI);
		}
	}

}
