package com.mkpits.threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		
  for(int i=1; i<5; i++) {
	  System.out.println("====" +i+ "");
  }
	}
	

}
