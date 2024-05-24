package com.mkpits.method;

public class MethodWithAgrument { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String firstName = "Samiksha";
      String lastName ="Patil";
      String email = "samiksha@.com";
      String password ="12345";
      long mobile = 9675443234l;
      char gender = 'F';  
       
      MethodWithAgrument m = new MethodWithAgrument();
      // either we can only used the above declared variables in main class or we can directly pass the value 
      //while calling the method
      m.getFirstName(firstName);
      m.getLastName(lastName );
      m.getEmail(email );
      m.getPassword(password);
      m.getMobile(mobile );
      m.getGender('m');
      
	}

	public void getGender(char ch) {
		// TODO Auto-generated method stub
		System.out.println(ch);
	}

	public void getPassword(String pass) {
		// TODO Auto-generated method stub
		System.out.println(pass);
	}

	public void getMobile(long num) {
		// TODO Auto-generated method stub
		System.out.println(num);
	}

	public void getLastName(String lname) {
		// TODO Auto-generated method stub
		System.out.println(lname);
	}

	public void getEmail(String mail) {
		// TODO Auto-generated method stub
		System.out.println(mail);
	}

	public void getFirstName(String fname) {
		// TODO Auto-generated method stub
		System.out.println(fname);
		
	}
	

}
