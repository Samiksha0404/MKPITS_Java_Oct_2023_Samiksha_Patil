package com.mkpits.dateandtime;

import java.time.LocalTime;

public class LocalTimeClass {

	public static void main(String[] args) {

		//This is the time of midnight at the start of the day.
		LocalTime time=LocalTime.now();
		System.out.println("Current Time is :"+ time);

	}

}
