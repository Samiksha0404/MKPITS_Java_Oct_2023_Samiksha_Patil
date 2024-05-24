package com.mkpits.threads;

public class Application {

	public static void main(String[] args) {
		
		MyThread m1 = new MyThread();
		m1.start();
		MyThread2 m2 = new MyThread2();
        Thread t1 = new Thread(m2);
        t1.start();
		}

}
