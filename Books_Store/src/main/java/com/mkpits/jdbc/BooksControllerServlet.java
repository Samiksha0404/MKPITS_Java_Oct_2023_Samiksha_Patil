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
 * Servlet implementation class BooksControllerServlet
 */
@WebServlet("/BooksControllerServlet")
public class BooksControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	private BooksDbUtil booksDbutil;
	@Resource(name = "jdbc/bookstore")
	private DataSource dataSource;

	public void init() throws ServletException {
		super.init();
		// create student db util ..and pass int the conn pool / dataSource
		try {
			booksDbutil = new BooksDbUtil(dataSource);
		} catch (Exception exe) {
			throw new ServletException(exe);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			// read the "command" parameter
			String theCommand = request.getParameter("command");

			// if the command is missing,then default to listing student

			if (theCommand == null) {
				theCommand = "LIST";
			}

			// route to the appropriate method
			switch (theCommand) {
			case "LIST":
				listBooks(request, response);
				break;
				
			case "RECORDS":
				listRecords(request,response);
				break;
				
			case "ADD":
				addBook(request, response);
				break;
			case "LOAD":
				loadBook(request, response);
				break;
			case "UPDATE":
				updateBook(request, response);
				break;
			case "DELETE":
				deleteBook(request, response);
				break;
			default:
				listBooks(request, response);
			}
			listBooks(request, response);
		} catch (Exception e) {
			 throw new ServletException();
		}
	}

	private void listRecords(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get student from db util
				String spageid = request.getParameter("page");
				int pageid = Integer.parseInt(spageid);
				int total = 100;
				if (pageid == 1) {
				} else {
					pageid = pageid - 1;
					pageid = pageid * total + 1;
				}
				List<Books_Model> books = booksDbutil.getBooks(pageid, total);
				// add student to the request
				request.setAttribute("BOOKS_LIST", books);
				// send to JSP page view
				RequestDispatcher dispatcher = request.getRequestDispatcher("/list-books.jsp");
				dispatcher.forward(request, response);

			}
		
	

	private void deleteBook(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// read student id from form data
		String bookId = request.getParameter("bookId");

		// delete student from database
		booksDbutil.deleteBook(bookId);

		// send back to again "list-student.jsp"
		listBooks(request, response);

	}

	private void updateBook(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// read student id from form data
		String bookId = request.getParameter("bookId");
		int id = Integer.parseInt(bookId);

		// read student data from form
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String date = request.getParameter("date");
		String genres = request.getParameter("genres");
		String characters = request.getParameter("characters");
		String synopsis = request.getParameter("synopsis");

		// create a new student object
		Books_Model theBook = new Books_Model(id, title, author, date, genres, characters, synopsis);
		// perform update on database
		booksDbutil.updatBook(theBook);

		// send them back to the list "list-students" page
		listBooks(request, response);

	}

	private void loadBook(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// read student id from data
		String theBookId = request.getParameter("bookId");
		// get student from database(dbutility)
		Books_Model theBook = booksDbutil.loadBooks(theBookId);

		// place student in the request attribute
		request.setAttribute("THE_BOOK", theBook);

		// send to jsp page view
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update-list-books.jsp");
		dispatcher.forward(request, response);

	}

	private void addBook(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// read student data form

		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String date = request.getParameter("date");
		String genres = request.getParameter("genres");
		String characters = request.getParameter("characters");
		String synopsis = request.getParameter("synopsis");

		// create new Student_Model object

		Books_Model theBook = new Books_Model(title, author, date, genres, characters, synopsis);
		// add student to the database
		booksDbutil.addBook(theBook);

		// send back to the main page(the Student list)
		listBooks(request, response);

	}

	private void listBooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get student from db util
		
		List<Books_Model> books = booksDbutil.getBooks();
		// add student to the request
		request.setAttribute("BOOKS_LIST", books);
		// send to JSP page view
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-books.jsp");
		dispatcher.forward(request, response);

	}
}
