<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Books</title>
<link type="text/css" rel="stylesheet" href="css/addBtn.css">
</head>
<body>

	<h3>Add Books</h3>
	
	<form action="BooksControllerServlet" method="get">
		<input type="hidden" name="command" value="ADD" /> <input
			type="hidden" name="booksId" value="${THE_BOOK}"/>
		<table>
			<tbody>
				<tr>
					<td><label>Books Title :</label></td>
					<td><input type="text" name="title" required="required"
						value="${THE_BOOK.title}"></td>
				</tr>
				<tr>
					<td><label>Author Name :</label></td>
					<td><input type="text" name="author" required="required"
						value="${THE_BOOK.author}"></td>
				</tr>
				<tr>
					<td><label>Date :</label></td>
					<td><input type="date" name="date" required="required"
						value="${THE_BOOK.date}"></td>
				</tr>
				<tr>
					<td><label>Genres :</label></td>
					<td><input type="text" name="genres" required="required"
						value="${THE_BOOK.genres}"></td>
				</tr>
				<tr>
					<td><label>Characters :</label></td>
					<td><input type="text" name="characters" required="required"
						value="${THE_BOOK.characters}"></td>
				</tr>
				<tr>
					<td><label>Synopsis :</label></td>
					<td><input type="text" name="synopsis" required="required"
						value="${THE_BOOK.synopsis}"></td>
				</tr>
				<tr>
					<td><button type="submit" value="Add" class="save">Add</button></td></tr>
			</tbody>
		</table>
	</form>
	<div style="clear: both;"></div>
	<p>
		<a href="BooksControllerServlet">Back To List</a>
	</p>

</body>
</html>