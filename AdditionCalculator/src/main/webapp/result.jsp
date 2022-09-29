<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<h1>Addition Calculator</h1>
<h2>Two Number Total</h2>
<p>
The total of the two numbers is:
${userInput.getResult()}
</p>
<a href = "thirdNumber.jsp">
	<button>
		Next
	</button>
</a>
</body>
</html>