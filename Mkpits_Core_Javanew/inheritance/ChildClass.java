package com.mkpits.inheritance;

public class ChildClass extends ParentClass 
{
	long mobileNo;
	int pinCode;
	String gender;
	
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	 void getDetails()
	{
		System.out.println("Fist Name :"+fName);
		System.out.println("Last Name :"+lName);
		System.out.println("Email ;"+email);
		System.out.println("Mobile Number :"+mobileNo);
		System.out.println("Gender :"+gender);
		System.out.println("Pincode :"+pinCode);
	}
	
}
