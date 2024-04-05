package com.mkpits.jsp;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeConverter {
	 public static void main(String[] args) {
		    String time = "04:00 PM"; // Change this to your desired time

		    try {
		      // Create a SimpleDateFormat object for parsing 12-hour time format
		      SimpleDateFormat inFormatter = new SimpleDateFormat("hh:mm aa");
		      
		      // Parse the time string
		      java.util.Date date = inFormatter.parse(time);

		      // Create a SimpleDateFormat object for formatting 24-hour time format
		      SimpleDateFormat outFormatter = new SimpleDateFormat("HH:mm");

		      // Convert the date object to 24-hour time string
		      String militaryTime = outFormatter.format(date);

		      System.out.println(time + " in 24-hour format: " + militaryTime);
		    } catch (ParseException e) {
		      System.out.println("Invalid time format. Please use HH:MM AM/PM format.");
		    }
		  }
}
