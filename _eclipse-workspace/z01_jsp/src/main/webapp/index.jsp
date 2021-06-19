<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test JSP</title>
</head>
<body>

<ol>
<li>
	<h3>out.println(request.getMethod())</h3>
	<% out.println(request.getMethod()); %>
</li>
<li>
</li>

</ol>



<hr/>

<% out.println(request.getLocale()); %> 

<hr/>

<% out.println(request.getHeader("user-agent")); %>

<h2>java.util.Date()</h2>
New Date() is __ <%=new java.util.Date() %>

</body>
</html>