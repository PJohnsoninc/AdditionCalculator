<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Total Result</title>
</head>
<body>
<h1>Addition Calculator</h1>
<h2>Three Number Total</h2>
<p>
The total of the three numbers is:
${userTotalInput.getTotalResult()}
</p>
<a href = "index.jsp">
	<button>
		Start Again
	</button>
</a>
</body>
</html>

