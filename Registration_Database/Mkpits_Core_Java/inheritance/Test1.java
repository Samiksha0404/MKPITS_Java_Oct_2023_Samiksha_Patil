package com.mkpits.inheritance;

public class Test1 extends Student {
 
	int subject1, subject2;

	protected int getMark(int subject1 ,int subject2) {
		this.subject1 = subject1;
		this.subject2 = subject2;
		System.out.println("Subject1 : "+ subject1 +"Subject2 : "+subject2);
		int z = subject1 + subject2;
		return z;
	}

}