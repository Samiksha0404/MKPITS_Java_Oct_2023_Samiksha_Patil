package com.mkpits.jdbc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/StudentControllerServlet")
public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    private StudentDbUtil studentDbUtil;
    @Resource(name = "jdbc/web_student_tracker")
    private DataSource dataSource;
   
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
//create our student db util... and pass in the conn pool/datasource
    	
    	try {
    		studentDbUtil = new StudentDbUtil(dataSource);
    	}
    	catch (Exception exc) {
        throw  new ServletException(exc);		
        }
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		   try {
			 listStudents(request, response);
		} catch (Exception e) {
			throw new ServletException();
		}
		}
		
	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {
     // get students from db util
		List<Student> students = studentDbUtil.getStudents();
		
		//add students to the request
		request.setAttribute("STUDENT_LIST", students);
		
		//send to JSP page(view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-student.jsp");
		dispatcher.forward(request, response);
		
	}

}
