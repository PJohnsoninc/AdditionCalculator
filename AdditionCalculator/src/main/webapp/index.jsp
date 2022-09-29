<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition Calculator</title>
</head>
<body>
   <h1>Addition Calculator</h1>
   <h2>Add Two Numbers</h2>
   <form action = "getCalculationServlet" method = "post">
   Enter the first whole number:
   <input type = "text" name = "firstUserNumber" size = "10"><br>
   Enter the second whole number:
   <input type = "text" name = "secondUserNumber" size = "10"><br>
   <input type = "submit" value = "Calculate" />
   </form>
</body>
</html>