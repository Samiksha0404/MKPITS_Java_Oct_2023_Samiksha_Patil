package com.mkpits.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import com.mkpits.registration.DataDbUtil;

/**
 * Servlet implementation class DataBaseController
 */
@WebServlet("/DataBaseController")
public class DataBaseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private DataDbUtil dataDbutil;
	@Resource(name = "jdbc/registrationdatabase")
	private DataSource dataSource;

	public void init(ServletConfig config) throws ServletException {
		super.init();
		// create student db util ..and pass int the conn pool / dataSource
		try {
			dataDbutil = new DataDbUtil(dataSource);
		} catch (Exception exe) {
			throw new ServletException(exe);
		}
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
			
			addData(request, response);	
		
		
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		try {
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationdatabase","root","");
			String n=request.getParameter("Email").trim();
			String p=request.getParameter("Password");
			PreparedStatement ps=conn.prepareStatement("select Email from userdetails where Email=? and Password=?");
			ps.setString(1, n);
			ps.setString(2, p);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			}else {
		
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
				
			}
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	


	


	private void addData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("Name");
		String email = request.getParameter("Email");
		String city= request.getParameter("City");
		String gender = request.getParameter("Gender");
		String age = request.getParameter("Age");
		String mobile = request.getParameter("Mobile") ;
		String password = request.getParameter("Password");


		// create new Student_Model object

		ModelClass theData = new ModelClass(name, mobile, city, gender, age, email, password);
		// add student to the database
		dataDbutil.addData(theData); 

		RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
		dispatcher.forward(request, response);	
		
	
	}

}
