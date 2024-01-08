package com.mkpits.inheritance;

public class Result  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		t1.getInfo(14,"sami");
		t1.getName();
		System.out.println("\nTotal Marks= "+t1.getMark(34, 45) + t2.getMark(30, 49));
	
		System.out.println("\nAverage is = "+ (t1.getMark(34, 45) + t2.getMark(30, 49)) / 4 );
	}

}
