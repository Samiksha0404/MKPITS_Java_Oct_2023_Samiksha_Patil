package com.mkpits.concurrency;

public class MyThread2 extends Thread {
Table t;
	public MyThread2(Table t2) {
		this.t = t2;
	}
	@Override
		public void run() {
			t.printTable(7);
		}
}
