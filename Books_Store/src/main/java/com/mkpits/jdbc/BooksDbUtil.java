package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;



public class BooksDbUtil {
private  DataSource dataSource;
	
	public BooksDbUtil(DataSource dataSource) {
		this.dataSource=dataSource;
}
	public List<Books_Model> getBooks()throws Exception  {
		List<Books_Model> books=new ArrayList<>();
		//get connection to the database
				Connection myConn=null;
				Statement myStmt=null;
				ResultSet myRs=null;
				try {
					myConn=dataSource.getConnection();
					
					//create sql statement
					String sql="select * from books order by id";
					myStmt=myConn.createStatement();
					//execute sql query
					myRs=myStmt.executeQuery(sql);
					
					//process the result set
					while(myRs.next()) {
						int id=myRs.getInt("id");
						String title=myRs.getString("title");
						String author=myRs.getString("author");
						String date=myRs.getString("date");
						String genres=myRs.getString("genres");
						String chracters=myRs.getString("characters");
						String synopsis=myRs.getString("synopsis");
						
					    //create new Student object
						Books_Model tempBooks=new Books_Model(id, title, author, date, genres, chracters, synopsis);
						//add it to list of the student
						books.add(tempBooks);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					//close jdbc object
					close(myConn,myStmt,myRs);
				}
				return books;
	}
	
	       private void close(Connection myConn,Statement myStmt,ResultSet myRs) {
		try {
			if(myRs != null) {
				myRs.close();
			}if(myStmt != null) {
				myStmt.close();
			}
			if(myConn != null) {
				myConn.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
		
		public  void addBook(Books_Model theBook) {
			Connection myConn = null;
			PreparedStatement myStmt = null;
			
			try {
				// get db connection
				myConn = dataSource.getConnection();

							// create sql for insert
							String sql = "insert into books(title,author,date,genres,characters,synopsis) values(?,?,?,?,?,?)";
							myStmt = myConn.prepareStatement(sql);

							// set the param values for the student
							myStmt.setString(1, theBook.getTitle());
							myStmt.setString(2, theBook.getAuthor());
							myStmt.setString(3, theBook.getDate());
							myStmt.setString(4, theBook.getGenres());
							myStmt.setString(5, theBook.getCharacters());
							myStmt.setString(6, theBook.getSynopsis());
							

							// execute SQL insert
							myStmt.execute();
						} catch (Exception e) {
							e.printStackTrace();
						} finally {
							close(myConn, myStmt, null);
						}
			
		}
		public Books_Model loadBooks(String theBookId) {
			Books_Model theBook = null;
			Connection myConn = null;
			PreparedStatement myStmt = null;
			ResultSet myRs = null;
			int bookId;

			try {
				// convert student id into integer
				bookId = Integer.parseInt(theBookId);

				// get database connection
				myConn = dataSource.getConnection();

				// create sql to get selected student
				String sql = "select * from books where id = ?";

				// create a prepared statement
				myStmt = myConn.prepareStatement(sql);

				// set params
				myStmt.setInt(1,bookId);

				// execute statement
				myRs = myStmt.executeQuery();

				// retrive data from result set row
				if (myRs.next()) {
					String title=myRs.getString("title");
					String author=myRs.getString("author");
					String date=myRs.getString("date");
					String genres=myRs.getString("genres");
					String chracters=myRs.getString("characters");
					String synopsis=myRs.getString("synopsis");

					// use the bookid during construction
					theBook = new Books_Model(bookId, title, author, date, genres, chracters, synopsis);
				} else {
					throw new Exception("Could not find studentid " + bookId);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(myConn, myStmt, myRs);
			}

			return theBook;
		}
		public void updatBook(Books_Model theBook) throws SQLException {
			Connection myConn = null;
			PreparedStatement myStmt = null;
			try {

				// get db connection

				myConn = dataSource.getConnection();

				// create sql to get update student
				String sql = "update books set title = ?,author = ?,date = ?,genres = ?,characters = ?,synopsis = ? where id = ?";

				// create a prepared statement
				myStmt = myConn.prepareStatement(sql);

				// set params
				myStmt.setString(1, theBook.getTitle());
				myStmt.setString(2, theBook.getAuthor());
				myStmt.setString(3, theBook.getDate());
				myStmt.setString(4, theBook.getGenres());
				myStmt.setString(5, theBook.getCharacters());
				myStmt.setString(6, theBook.getSynopsis());
				myStmt.setInt(7, theBook.getId());
				

				// execute SQL statement
				myStmt.execute();

			} finally {
				close(myConn, myStmt, null);
			}

			
		}
		public void deleteBook(String bookId) throws SQLException {
			Connection myConn = null;
			PreparedStatement myStmt = null;
			try {
				// convert student to integer
				int theBookId = Integer.parseInt(bookId);

				// get db connection

				myConn = dataSource.getConnection();

				// create sql to get update student
				String sql = "delete from books where id = ?";

				// create a prepared statement
				myStmt = myConn.prepareStatement(sql);
				
				//set params
				myStmt.setInt(1, theBookId);
				
				//execute sql
				myStmt.execute();
			} finally {
				close(myConn, myStmt, null);
			}

			
			
		}
		public List<Books_Model> getBooks(int start, int total) {
			List<Books_Model> books=new ArrayList<>();
			//get connection to the database
					Connection myConn=null;
					Statement myStmt=null;
					ResultSet myRs=null;
					try {
						myConn=dataSource.getConnection();
						
						//create sql statement
						String sql="select * from books  limit "+(start-1)+","+total;
						myStmt=myConn.createStatement();
						//execute sql query
						myRs=myStmt.executeQuery(sql);
						
						//process the result set
						while(myRs.next()) {
							int id=myRs.getInt("id");
							String title=myRs.getString("title");
							String author=myRs.getString("author");
							String date=myRs.getString("date");
							String genres=myRs.getString("genres");
							String chracters=myRs.getString("characters");
							String synopsis=myRs.getString("synopsis");
							
						    //create new Student object
							Books_Model tempBooks=new Books_Model(id, title, author, date, genres, chracters, synopsis);
							//add it to list of the student
							books.add(tempBooks);
						}
					}catch(Exception e) {
						e.printStackTrace();
					}finally {
						//close jdbc object
						close(myConn,myStmt,myRs);
					}
					return books;
		}
		
		
		


	
}
