package com.mkpits.jdbc1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

public class StudentDbUtility {

  private DataSource dataSource;
  
  public StudentDbUtility(DataSource dataSource) {
	  
	  this.dataSource = dataSource;
  }
  
  public List<Student_Model>  getStudents() throws Exception {
	  List<Student_Model> students = new ArrayList<>();
	 
	  Connection myConn = null;//conn establish of data
	  Statement myStmt = null;// query likhi h
	  ResultSet myRs = null;// joh query likhi h vo yaha ayega
	  
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
			  //System.out.println(id);

			  
			  //create new student object
			  Student_Model tempStudent = new Student_Model(id, firstName, lastName, email);
			  
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
