<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import = "java.sql.Connection"%>
<%@page import = "java.sql.DriverManager"%>
<%@page import = "com.project.jdbc.JDBC"%>

<html>
<body>
<h3> TEST JDBC CONNECTION</h3><br/>
<%
JDBC.test();
%>
<br/>



</body>
</html>


