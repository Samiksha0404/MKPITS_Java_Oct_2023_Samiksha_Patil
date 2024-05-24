package com.mkpits.concurrency;

public class MyWorkerThread extends Thread {
String task;

public MyWorkerThread(String s) {
	this.task = s;
}
@Override
	public void run() {
	System.out.println(Thread.currentThread().getName()+"(Start) task = "+task);
	processtask();// call processtask method that sleep
	System.out.println(Thread.currentThread().getName()+"(End)");
	
	}
private void processtask() {

	try {
		Thread.sleep(10000);
	} catch (Exception e) {
      e.printStackTrace();
	}
}

}
