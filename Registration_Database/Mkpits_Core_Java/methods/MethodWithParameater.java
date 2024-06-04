package com.mkpits.methods;

public class MethodWithParameater {

	public static void main(String[] args) {
		String userName="Ashik@0408";
		String password="Ashik128";
		
		MethodWithParameater mp=new MethodWithParameater();
		// calling method
		mp.getUser(userName);
		mp.getPassword(password);


	}
	
	// Called Method
	public void getPassword(String password) 
	{
		System.out.println("Password : "+password);
	}
	
	// Called Method
	public void getUser(String userName) 
	{
		System.out.println("User Name : "+userName);
	}

}
