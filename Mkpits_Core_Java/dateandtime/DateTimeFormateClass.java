package com.mkpits.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormateClass {

	public static void main(String[] args) {
		
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println("Before Formate :"+dateTime);
		
		//This method will create a formatter based on a simple
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/mm/yy   hh:mm:ss");
		
		System.out.println("After Formate:");
		String formatedDateTime=dateTime.format(formatter);
		System.out.println(formatedDateTime);

	}

}
