package com.mkpits.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

public class DataDbUtil {
	private DataSource dataSource;

	public DataDbUtil(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	private void close(Connection myConn, PreparedStatement myStmt, ResultSet myRs) {
		try {
			if (myRs != null) {
				myRs.close();
			}
			if (myStmt != null) {
				myStmt.close();
			}
			if (myConn != null) {
				myConn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void addData(ModelClass theData) {
		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			// get db connection
			myConn = dataSource.getConnection();

			// create sql for insert
			String sql = "insert into userdetails(Name,Mobile,City,Gender,Age,Email,Password) values(?,?,?,?,?,?,?)";
			myStmt = myConn.prepareStatement(sql);
      
			myStmt.setString(1, theData.getName());
			myStmt.setLong(2, theData.getMobile());
			myStmt.setString(3, theData.getCity());
			myStmt.setString(4, theData.getGender());
			myStmt.setString(5, theData.getAge());
			myStmt.setString(6, theData.getEmail());
			myStmt.setString(7, theData.getPassword());

			// execute SQL insert
						myStmt.execute();
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						close(myConn, myStmt, null);
					}
					
				}

	}


