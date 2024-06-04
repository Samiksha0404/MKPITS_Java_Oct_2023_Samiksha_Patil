package com.mkpits.operators;

public class Increment {

	public static void main(String[] args) {
	   
		
		
		// TODO Auto-generated method stub
		Increment  in = new Increment ();
		in.add(10,20);
		in.mul(25,45);
		in.sub(45,123);
		in.mod();
		in.div();
		in.increment(123);
  
        
	}

	private double div() {
		// TODO Auto-generated method stub
		double division = 53/5;
		return division;
	}

	private void mod() {
		// TODO Auto-generated method stub
		double mod=9%35;
		int modu=35%5;
		System.out.println(mod +" "+modu);
				
	}

	private int sub(int i, int j) {
		// TODO Auto-generated method stub
		 j-=i;
		System.out.println(j);
		return j;
	}

	private long mul(int i, int j) {
		// TODO Auto-generated method stub
		 i *= j;
		System.out.println(i);
		return i;
	}

	public void increment(int  id) {
		// TODO Auto-generated method stub
		System.out.println(++id);
		System.out.println(id++);
		System.out.println(id++);
		System.out.println(++id);
		System.out.println(id++);
		System.out.println(id);
	}

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		a += b;
		System.out.println(a);
		return a;
	}
   
}
