package com.mkpits.operators;

public class Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Decrement  d = new Decrement();
       d.decrement();
       
	}

	public void decrement() {
		// TODO Auto-generated method stub
		int a = 40;
		System.out.println(a--);
		//p=40 m=39
		System.out.println(--a);
		// p=38 m=38
		System.out.println(a--);
		//p=38 m=37
		System.out.println(a--);
		//p=37 m=36
		System.out.println(--a);
		//p=35 m=35
		System.out.println(a--);
		//p=35 m=34
		System.out.println(a);
		//p=34

	}

}
