package com.mkpits.constructor;

public class Constructor {

	int pincode =234667 , id=34;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Constructor obj1 = new Constructor();
       Constructor obj2 = new Constructor(345567, 122370);
       Constructor obj3 = new Constructor(obj1);
      Constructor obj4 = new Constructor(obj2);
       //it is not printed still this will give output 0
       
        
       
      obj1.getAddition(12,13);
      
//      int a=10;
//      String n = Integer.toString(a);
//      System.out.println(a);
	}

	public void getAddition(int a, int b) {
		// TODO Auto-generated method stub
		int c= a+b;
		System.out.println(c);
		
	}
	public Constructor()
 // object1
	{
		 pincode=440015;
		 id=001;
		System.out.println("constructor with no argument");
		
	}public Constructor(int a,double b) {
		double salary = b;
		int id= a;
		System.out.println(salary+"  "+id);
		System.out.println("parametrizied constructor");
	
		
	}
	public Constructor(Constructor o) {
	System.out.println("Contructor with Object");
	System.out.println(o.pincode);
   System.out.println(o.id);
   
    //obj3.getAddition(45,56 );
		//pincode = o.pincode;
	}
	
	}
	
		
	


