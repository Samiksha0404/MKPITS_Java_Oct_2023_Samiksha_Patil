package com.mkpits.constructor;

public class NoArgunmentConstructor 
{
	// Constructor is special type of method having same name as class name
	// is there is no constructor define in class jvm call default constructor called
	// constructor doesn't have any return type
	// constructor initialized when we create 
	// Constructor has no return type even keyword void is also not used.But constructor can have zero or multiple arguments.Constructor having no argument is called default constructor while constructor containing one or multiple argument called parameterized constructor.
	// Constructor has similar accessibility as of its class i.e. if class is public then constructor is by default public.
	
	public NoArgunmentConstructor() 
	{
		System.out.println("No Argunment Constructor Called.....");
	}

	public static void main(String[] args) 
	{
		NoArgunmentConstructor nac=new NoArgunmentConstructor();

	}

}
