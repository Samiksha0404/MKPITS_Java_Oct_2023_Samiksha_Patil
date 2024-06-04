package com.mkpits.method;

public class ReturnTypePractise {

	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTypePractise  obj= new ReturnTypePractise ();
		obj.getAllData();
        
	}
	public  void getAllData() {
		// we cannot directly print getAllData() because compiler can only print single method at time
		//static method cannot be used with non static method
		
		// TODO Auto-generated method stub
		 System.out.println(" THE  DETAILS ARE GIVEN BELOW :");
		 System.out.print(getFirstName());
		 System.out.println(" "+getLasttName());
		 System.out.println(getEmail());
		 System.out.println(getMobile());
		 System.out.println(getGender());  
	}
	public String getFirstName() {
		// TODO Auto-generated method stub
		String firstName = "Samiksha";
		return firstName;
	}
	public String getLasttName() {
		// TODO Auto-generated method stub
		String lastName = "Patil";
		return lastName;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		String email = "Samiksha@123.com";	
		return email;
	}
	public long getMobile() {
		// TODO Auto-generated method stub
		long mobile = 9756897345L;	
		return mobile;
	}
	public String getGender() {
		// TODO Auto-generated method stub
		String gender = "female";
		return gender;
	}
	

}
