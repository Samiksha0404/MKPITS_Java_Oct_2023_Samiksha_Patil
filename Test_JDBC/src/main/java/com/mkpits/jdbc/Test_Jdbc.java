package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test_Jdbc {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "");
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from productlines");
			while (rs.next())
				System.out.println(
						rs.getString(1) + "  " + rs.getString(2));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
