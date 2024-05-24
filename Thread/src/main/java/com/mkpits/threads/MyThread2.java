package com.mkpits.threads;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5 ;i++) {
			System.out.println("thread by"+"runnable interface==="+i+"");
			
		}
		
	}

}
