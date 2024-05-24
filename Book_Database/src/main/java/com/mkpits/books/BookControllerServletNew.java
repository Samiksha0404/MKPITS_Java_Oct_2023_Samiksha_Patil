package com.mkpits.books;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/BookControllerServletNew")
public class BookControllerServletNew extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private BooksDbUtility bookDbUtil;
    
    @Resource(name = "jdbc/books_data")
    private DataSource dataSource;

    @Override
    public void init() throws ServletException {
        super.init();
        try {
            bookDbUtil = new BooksDbUtility(dataSource);
        } catch (Exception exc) {
            throw new ServletException(exc);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String theCommand = request.getParameter("command");
            if (theCommand == null) {
                theCommand = "LIST";
            }

            switch (theCommand) {
                case "LIST":
                    listBooks(request, response);
                    break;
                case "RECORDS":
                    listRecord(request, response);
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
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    private void listRecord(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        String spageid = request.getParameter("page");
        int pageid = (spageid == null) ? 1 : Integer.parseInt(spageid);
        int total = 10;
        int start = (pageid - 1) * total;

        List<Book_DatabaseModel> books = bookDbUtil.getBooks(start, total);

        request.setAttribute("BOOK_LIST", books);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/list_book_button.jsp");
        dispatcher.forward(request, response);
    }

    private void deleteBook(HttpServletRequest request, HttpServletResponse response) {
        try {
            String bookId = request.getParameter("bookId");
            bookDbUtil.deleteBook(bookId);
            listBooks(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateBook(HttpServletRequest request, HttpServletResponse response) {
        try {
            String bookId = request.getParameter("bookId");
            int id = Integer.parseInt(bookId);
            String title = request.getParameter("title");
            String author = request.getParameter("author");
            String date = request.getParameter("date");
            String genres = request.getParameter("genres");
            String characters = request.getParameter("characters");
            String synopsis = request.getParameter("synopsis");

            Book_DatabaseModel theBook = new Book_DatabaseModel(id, title, author, date, genres, characters, synopsis);

            bookDbUtil.updateBook(theBook);
            listBooks(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadBook(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String theBookId = request.getParameter("bookId");
            Book_DatabaseModel theBook = bookDbUtil.loadBook(theBookId);
            request.setAttribute("THE_BOOK", theBook);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/update_list_book.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addBook(HttpServletRequest request, HttpServletResponse response) {
        try {
            String title = request.getParameter("title");
            String author = request.getParameter("author");
            String date = request.getParameter("date");
            String genres = request.getParameter("genres");
            String characters = request.getParameter("characters");
            String synopsis = request.getParameter("synopsis");

            Book_DatabaseModel theBook = new Book_DatabaseModel(title, author, date, genres, characters, synopsis);

            bookDbUtil.addBook(theBook);
            listBooks(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void listBooks(HttpServletRequest request, HttpServletResponse response) {
        try {
            List<Book_DatabaseModel> books = bookDbUtil.getBooks();
            request.setAttribute("BOOK_LIST", books);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/list_book_button.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
