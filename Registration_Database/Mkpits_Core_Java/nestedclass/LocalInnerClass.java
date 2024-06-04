package com.mkpits.nestedclass;

public class LocalInnerClass 
{
	
	private int pinCode=440023;
	
	void getDETAILS(String name)
	{
		// local inner class is class which is present in the block of the method
		class InnerClass
		{
			String name;
			// constructor
			public InnerClass(String name) {
				super();
				this.name = name;
			}

			// method 
			void showDetail()
			{
				System.out.println("Pincode of your City :"+pinCode);
				System.out.println("Your Name is :"+name);
			}
		}
		// object creation inside that method 
		InnerClass innerClass=new InnerClass(name);
		// calling inner class method through obj
		innerClass.showDetail();

	}
	
}
