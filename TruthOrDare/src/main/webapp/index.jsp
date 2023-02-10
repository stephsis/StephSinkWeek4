<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Let's Play Truth or Dare</title>
</head>
<body>
	<h1>Truth or Dare</h1>
	<form action="getTruthOrDareServlet" method="post">
		<p>Would you like a truth or a dare?</p> 
		<input type="text" name="userInput" size="50">
		<br>
		<br>
		<input type="submit" value="Let's Play"/>
	</form>
</body>
</html>