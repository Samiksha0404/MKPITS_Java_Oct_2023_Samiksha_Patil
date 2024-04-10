package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

public class StudentDbUtil {

  private DataSource dataSource;
  
  public StudentDbUtil(DataSource dataSource) {
	  
	  this.dataSource = dataSource;
  }
  
  public List<Student>  getStudents() throws Exception {
	  List<Student> students = new ArrayList<>();
	 
	  Connection myConn = null;
	  Statement myStmt = null;
	  ResultSet myRs = null;
	  
	  try {
		  
		  myConn = dataSource.getConnection();
		  
		  //create a sql statement
		  String sql = "Select * from student order by last_name";
		  myStmt = myConn.createStatement();
		  
		  //execute sql query
		  myRs = myStmt.executeQuery(sql);
		  
		  //process the result set
		  while(myRs.next()) {
			  
			  //retrieve data from result set
			  int id = myRs.getInt("id");
			  String firstName = myRs.getString("first_name");
			  String lastName = myRs.getString("last_name");
			  String email = myRs.getString("email");

			  
			  //create new student object
			  Student tempStudent = new Student(id, firstName, lastName, email);
			  
			  //add it to the list of the student
			  students.add(tempStudent);
		  }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  } finally {
		  close(myConn, myStmt, myRs);
		  
	  }
	  return students;
	  
  }

private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
	try {
		if(myRs != null) {
			myRs.close();
		}
		if(myStmt != null) {
			myStmt.close();
		}
		if(myConn != null) {
			myStmt.close();
	}
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}

}
