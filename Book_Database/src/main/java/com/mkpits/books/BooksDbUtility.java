package com.mkpits.books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class BooksDbUtility {

    private DataSource dataSource;

    public BooksDbUtility(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Book_DatabaseModel> getBooks() {
        List<Book_DatabaseModel> books = new ArrayList<>();

        try (Connection myConn = dataSource.getConnection();
             PreparedStatement myStmt = myConn.prepareStatement("SELECT * FROM books LIMIT 0,10");
             ResultSet myRs = myStmt.executeQuery()) {

            while (myRs.next()) {
                int id = myRs.getInt("id");
                String title = myRs.getString("title");
                String author = myRs.getString("author");
                String date = myRs.getString("date");
                String genres = myRs.getString("genres");
                String characters = myRs.getString("characters");
                String synopsis = myRs.getString("synopsis");

                Book_DatabaseModel tempbooks = new Book_DatabaseModel(id, title, author, date, genres, characters, synopsis);
                books.add(tempbooks);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
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

    public void deleteBook(String bookId) {
        try (Connection myConn = dataSource.getConnection();
             PreparedStatement myStmt = myConn.prepareStatement("DELETE FROM books WHERE id = ?")) {

            int theBookId = Integer.parseInt(bookId);
            myStmt.setInt(1, theBookId);
            myStmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBook(Book_DatabaseModel theBook) {
        try (Connection myConn = dataSource.getConnection();
             PreparedStatement myStmt = myConn.prepareStatement(
                     "UPDATE books SET title = ?, author = ?, date = ?, genres = ?, characters = ?, synopsis = ? WHERE id = ?")) {

            myStmt.setString(1, theBook.getTitle());
            myStmt.setString(2, theBook.getAuthor());
            myStmt.setString(3, theBook.getDate());
            myStmt.setString(4, theBook.getGenres());
            myStmt.setString(5, theBook.getCharacters());
            myStmt.setString(6, theBook.getSynopsis());
            myStmt.setInt(7, theBook.getId());

            myStmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Book_DatabaseModel loadBook(String theBookId) throws SQLException {
        Book_DatabaseModel theBook = null;
        int bookId;

        try (Connection myConn = dataSource.getConnection();
             PreparedStatement myStmt = myConn.prepareStatement("SELECT * FROM books WHERE id = ?");
             ResultSet myRs = myStmt.executeQuery()) {

            bookId = Integer.parseInt(theBookId);
            myStmt.setInt(1, bookId);
            if (myRs.next()) {
                String title = myRs.getString("title");
                String author = myRs.getString("author");
                String date = myRs.getString("date");
                String genres = myRs.getString("genres");
                String characters = myRs.getString("characters");
                String synopsis = myRs.getString("synopsis");

                theBook = new Book_DatabaseModel(bookId, title, author, date, genres, characters, synopsis);
            } else {
                throw new Exception("Could not find Bookid " + bookId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return theBook;
    }

    public void addBook(Book_DatabaseModel theBook) {
        try (Connection myConn = dataSource.getConnection();
             PreparedStatement myStmt = myConn.prepareStatement(
                     "INSERT INTO books (title, author, date, genres, characters, synopsis) VALUES (?, ?, ?, ?, ?, ?)")) {

            myStmt.setString(1, theBook.getTitle());
            myStmt.setString(2, theBook.getAuthor());
            myStmt.setString(3, theBook.getDate());
            myStmt.setString(4, theBook.getGenres());
            myStmt.setString(5, theBook.getCharacters());
            myStmt.setString(6, theBook.getSynopsis());

            myStmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Book_DatabaseModel> getBooks(int start, int total) throws SQLException {
        List<Book_DatabaseModel> books = new ArrayList<>();

        try (Connection myConn = dataSource.getConnection();
             PreparedStatement myStmt = myConn.prepareStatement("SELECT * FROM books LIMIT ?, ?")) {

            myStmt.setInt(1, start - 1);
            myStmt.setInt(2, total);
            try (ResultSet myRs = myStmt.executeQuery()) {
                while (myRs.next()) {
                    int id = myRs.getInt("id");
                    String title = myRs.getString("title");
                    String author = myRs.getString("author");
                    String date = myRs.getString("date");
                    String genres = myRs.getString("genres");
                    String characters = myRs.getString("characters");
                    String synopsis = myRs.getString("synopsis");

                    Book_DatabaseModel tempbooks = new Book_DatabaseModel(id, title, author, date, genres, characters, synopsis);
                    books.add(tempbooks);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return books;
    }
}
