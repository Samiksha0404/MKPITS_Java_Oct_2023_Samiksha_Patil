package com.mkpits.methodoverriding;


public  class Square extends Rectangle {
	int a,b;
	
       public  void area(int l,int b)  {
    	   
    	  
    	   int result = l*b;
    	   
    	   System.out.println("the area of square is: "+result);
       }
}
