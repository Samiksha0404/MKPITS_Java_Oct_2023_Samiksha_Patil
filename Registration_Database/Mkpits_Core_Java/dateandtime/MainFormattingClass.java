package com.mkpits.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainFormattingClass {

	public static void main(String[] args) {
		
		LocalDateTime obj =	LocalDateTime.now();
		System.out.println("before formating  " +obj);
		
		DateTimeFormatter formatobj = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		
		DateTimeFormatter formatobj1 = DateTimeFormatter.ofPattern("dd-mm-yyyy");

		DateTimeFormatter formatobj2 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

		DateTimeFormatter formatobj3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		

//DateTimeFormatter is used to format and print date according to users choice 
//		//yyyy-MM-dd	"1988-09-29"	
//		dd/MM/yyyy	"29/09/1988"	
//		dd-MMM-yyyy	"29-Sep-1988"	
//		E, MMM dd yyyy	"Thu, Sep 29 1988"
		
		String formatDate = obj.format(formatobj);
		String formatDate1 = obj.format(formatobj1);
		String formatDate2 = obj.format(formatobj2);
		String formatDate3 = obj.format(formatobj3);
		
		//format is the keyword
		System.out.println("after formatting " +formatDate);
		System.out.println("after formatting " +formatDate1);
		System.out.println("after formatting " +formatDate2);
		System.out.println("after formatting " +formatDate3);
	}

}
