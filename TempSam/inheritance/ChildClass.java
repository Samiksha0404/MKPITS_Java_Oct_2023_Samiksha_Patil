package com.mkpits.inheritance;

public class ChildClass extends ParentClass {
  String mob;
  String g;
  String pinCode;

	protected void getMobile(String mob) {
		this.mob = mob;
	}
	protected void getGender(String g) {
		
		this.g= g;
	}
	protected void getPincode(String pinCode) {
		this.pinCode = pinCode;
	}
	protected void getDetails()  {
		
	System.out.println(" first name " +fname);	
		System.out.println("last name " +lname);
		System.out.println("enter email :" +email);
		System.out.println("Enter gender "+g);
		
		System.out.println("mobile :"+mob);
		System.out.println("pincode : "+pinCode);
		}
	}
