package com.mkpits.dateandtime;

import java.time.LocalDateTime;

public class CurrentDateTimeClass {

	public static void main(String[] args) {

		LocalDateTime dateTime=LocalDateTime.now();//Obtains the current date-time from the system clock in the default time-zone.
		System.out.println("Current Date And Time :"+dateTime);

	}

}
