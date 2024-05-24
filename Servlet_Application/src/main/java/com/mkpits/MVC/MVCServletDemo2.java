package com.mkpits.MVC;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MVCServletDemo2
 */
@WebServlet("/MVCServletDemo2")
public class MVCServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MVCServletDemo2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get data from StudentUtil helper class
		
				List<Student> students= StudentDataUtil.getStudent();
				
				// add data to data object
				request.setAttribute("student_list", students);
				
				// get request dispatcher
				
				RequestDispatcher dispatcher=request.getRequestDispatcher("/view_student_data.jsp");
				
				// forward request
				dispatcher.forward(request,response);
	}

}
