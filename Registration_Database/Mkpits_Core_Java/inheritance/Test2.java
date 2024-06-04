package com.mkpits.inheritance;

public class Test2 extends Student {
	
	int subject3, subject4 ;
	 
	int getMark(int subject3, int subject4) {
	 
		this.subject3 = subject3;
		this.subject4 = subject4;
		System.out.println("Subject3 : " + subject3 + " Subject4 : " + subject4);
        int z1 = subject3 + subject4;
		return z1;
	}

}
