package com.mkpits.non_static_method;

public class CallingClass {

	public static void main(String[] args) 
	{
		CalledClass c= new CalledClass();
		
		String uname="ashikt128@gmail.com";
		long mobile=7774863377l;
		char ch='M';
		String pass="Ashik128";
		c.getUsername("ashik@0408");
		c.getMobile(8806335450l);
		c.getGender('M');
		c.getPassword("Ashik123");
		System.out.println("***********************************************");
		System.out.println("-----------------------------------------------");
		c.getUsername(uname);
		c.getMobile(mobile);
		c.getGender(ch);
		c.getPassword(pass);
		
		String str="";
		System.out.println(str);

	}

}
