<%@page import="com.project.hibernate.ProjectGuiMethods" %>
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
<br/>
</body>
</html>