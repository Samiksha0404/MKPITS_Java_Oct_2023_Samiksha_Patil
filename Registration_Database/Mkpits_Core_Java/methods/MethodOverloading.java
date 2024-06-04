package com.mkpits.methods;

public class MethodOverloading {
	
	// method is a block of statement which have four parts 1. Access Modifier 2. return type 3. mehod name 4. method body
	// method overloading is having same as method name but different parameters or argument
	// we can achieve method overloading by changing there no. of parameters and their sequences ....

	//,MethodOverloading mo1 =new MethodOverloading();
	public static void main(String[] args) 
	{
		MethodOverloading mo=new MethodOverloading();
		mo.getData();
		System.out.println("Name :-"+mo.getData("Ashik"));
		System.out.println("Mobile No. :-"+mo.getData(9834826072l));
		mo.getData('M');
		mo.getData("ashikt128@gmail.com", "Navneet Nagar Wadi Nagpur");
		mo.getData(440023, "Panychi Tanki");

	}
	 
	public void getData()
	{
		//System.out.println(mo1.getData(7875475764l));
		System.out.println("Welcome to Constructor Overloading Concept...");
	}
	
	public String getData(String name)
	{
		return name;
	}
	
	public long getData(long mob) 
	{
		return mob;
	}
	
	public void getData(char gen) 
	{
		System.out.println("Gender :-"+gen);
	}

	public void getData(String email, String address)
	{
		System.out.println("Email :-"+email);
		System.out.println("Address :-"+address);
	}
	
	public void getData(int pincode , String landMark)
	{
		System.out.println("Pincode :-"+pincode);
		System.out.println("Landmark :-"+landMark);
	}
}
