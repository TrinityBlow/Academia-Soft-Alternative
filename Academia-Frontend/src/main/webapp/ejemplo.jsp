<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! Integer a,b; %>
	<h1>Hello World!</h1>
	<% a = Integer.valueOf(request.getParameter("valor1"));
	b = Integer.valueOf(request.getParameter("valor2"));%>
	<p>a = <%= a %></p>
	<p>b = <%= b %></p>
	
	<p>Multiplicacion = <%= a * b %></p>
	<p>Division = <%= a / b %></p>
	<p>Resta = <%= a - b %></p>
	<p>Suma = <%= a + b %></p>
</body>
</html>