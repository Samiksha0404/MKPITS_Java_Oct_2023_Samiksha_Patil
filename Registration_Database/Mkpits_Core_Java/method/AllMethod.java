package com.mkpits.method;

public class AllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AllMethod o = new AllMethod();
		o.getDetails();
		o.getGreeting();
		o.getNum();
		o.getOrder();
		o.getId(123430);
		o.getInfo("harsh");
		
		}
	public static void getDetails()
	//static method 
	// method without argument
	//without return type
	{
		String name = "Samiksha Patil";
		System.out.println(name);
	}
	
	public void getGreeting()
	// non static method
	//without argument
	//no return type
	{
		String greeting = "hello";
		System.out.println(greeting);
		
	}
	public static int getNum()
	//static method 
	// method without argument
	//with return type
	{
		int num= 1234567;
		System.out.println(num);
		return num;
	}
	public  int getOrder()
	//static method 
	// method without argument
	//with return type
	{
		int od= 127;
		System.out.println(od);
		return od ;
	}
	
	public int getId(int id )
	// non static, with return type , with argument
	{
		System.out.println(id);
		return id;
	}
	public  static String getInfo(String fname)
	//static method
	//with argument 
	//return type
	{
		System.out.println(fname);
		return fname;
	
	}
	
}
