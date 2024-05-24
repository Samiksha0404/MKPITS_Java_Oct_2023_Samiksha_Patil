package com.mkpits.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Student_Servlet_post
 */
@WebServlet("/Student_Servlet_post")
public class Student_Servlet_post extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student_Servlet_post() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set conflict type
	     response.setContentType("text/html");
				
	    //get PrintWriter
		PrintWriter out = response.getWriter();
				
		//generate HTML content
		out.println("<html><body>");
		out.println("<h2>Welcome</h2>");
		out.println("<hr>");
		out.println("The Student is Confirmed :"+ request.getParameter("fname")+
				"   "+request.getParameter("lname"));
		out.println("</body></html>");
	}

}
