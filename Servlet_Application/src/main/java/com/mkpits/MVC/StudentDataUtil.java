package com.mkpits.MVC;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudent() {
		//create empty list
		
		List<Student>student=new ArrayList<Student>();
		
		//add data
		student.add(new Student("Ashik","Tembhare","ashik@gmail.com"));
		student.add(new Student("Raj","Warhokar","raj@gmail.com"));
		student.add(new Student("Pranav","Armfakar","pranav@gmail.com"));
		
		//return list
		return student;
	}
	
}
