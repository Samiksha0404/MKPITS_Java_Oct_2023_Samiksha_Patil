package com.mkpits.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test2 {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdatabase", "root", "");
		// here sonoo is database name, root is username and password
		PreparedStatement stmt=con.prepareStatement("insert into userdetails values(?,?,?)");  
		stmt.setInt(1,4);//1 specifies the first parameter in the query  
		stmt.setString(2,"Ratan");  
		stmt.setString(3,"09876543");  
		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
		  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  

	}

}
