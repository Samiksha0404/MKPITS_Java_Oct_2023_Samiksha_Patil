package com.mkpits.concurrency;

public class SynchronizationApplicztion {

	public static void main(String[] args) {
       
		Table tab1 = new Table();
		
		MyThread1 t1 = new MyThread1(tab1);
		MyThread2 t2 = new MyThread2(tab1);
		t1.start();
		t2.start();
		
		
	}

}
