package com.mkpits.method;

public class StaticMethodDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      getAllData();
	}

	public static void getAllData() {
		// TODO Auto-generated method stub
		System.out.println(" THE  DETAILS ARE GIVEN BELOW :");
		getFirstName();
		 getLasttName();
		 getEmail();
		 getMobile() ;
		 getGender(); 
	}

	public static void getFirstName() {
		// TODO Auto-generated method stub
		String firstName = "Samiksha";
		System.out.println("The First Name is : "+firstName);
	}
	public static void getLasttName() {
		// TODO Auto-generated method stub
		String lastName = "Patil";
		System.out.println("The last Name is : "+lastName);
	}
	public static void getEmail() {
		// TODO Auto-generated method stub
		String email = "Samiksha@123.com";	
		System.out.println("The email is : "+email);
	}
	public static void getMobile() {
		// TODO Auto-generated method stub
		long mobile = 9756897345L;	
		System.out.println("The Mobile Number is : "+mobile);
	}
	public static void getGender() {
		// TODO Auto-generated method stub
		String gender = "female";
		System.out.println("The gender is : "+gender);
	}
	

}
