package com.mkpits.concurrency;

public class MyThread1 extends Thread {

	Table t;
	public MyThread1(Table t) {
		this.t = t;
	}
	@Override
	public void run() {
		t.printTable(4);
	}
}
