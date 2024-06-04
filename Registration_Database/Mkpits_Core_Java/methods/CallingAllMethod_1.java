package com.mkpits.methods;

public class CallingAllMethod_1 {
	
	
	public static void getAllData()
	{
	  StaticMethodCallingDirectly smd= new StaticMethodCallingDirectly();
	  smd.getFirstName();
	  smd.getLastName();
	  StaticMethodCallingByClassName smc=new StaticMethodCallingByClassName();
	  smc.getEmail();
	  smc.getMobile();
	  StaticMethodCallingByObject smo=new StaticMethodCallingByObject();
	  smo.getGender();
	  smo.getPasword1();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Getting All Data From Other Classes :- \n ");
		getAllData();

	}

}
