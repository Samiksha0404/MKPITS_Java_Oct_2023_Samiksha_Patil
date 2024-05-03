package com.mkpits.registration;

import java.io.IOException;

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
	


	private void addData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("Name");
		String email = request.getParameter("Email");
		String city= request.getParameter("City");
		String gender = request.getParameter("Gender");
		String age = request.getParameter("Age");
		Long mobile = Long.parseLong(request.getParameter("Mobile")) ;
		String password = request.getParameter("Password");


		// create new Student_Model object

		ModelClass theData = new ModelClass(name, mobile, city, gender, age, email, password);
		// add student to the database
		dataDbutil.addData(theData); 

		RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
		dispatcher.forward(request, response);	
		
	
	}

}
