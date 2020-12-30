<%@page import="com.project.hibernate.ProjectGuiMethods" %>
<%@page import="java.lang.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>My Library</title>
	<meta charset="UTF-8"/>
</head>
<body>
Show ProjectGuiMethods___ <%=ProjectGuiMethods.helloWorld() %>
<br/><br/>

Welcome: <%=request.getParameter("user_name") %><br/>
Your password is: <%=request.getParameter("user_password") %>
<% 
System.out.println("say hi to console window");
String abc = "ok google";
int i = 1058;
String cde = Integer.toString(i);
%>

<br/>
<%out.println("<mark>"+cde+"</mark>");%>
<br/>

<br/>
</body>
</html>