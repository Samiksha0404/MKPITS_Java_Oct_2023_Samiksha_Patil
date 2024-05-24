package com.mkpits.threads;

public class Multithreading{

	public static void main(String[] args) {
		MyThread3 t1 = new MyThread3();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		t1.start();
		
		MyThread3 t2 = new MyThread3();
		t2.start();

	}

}
