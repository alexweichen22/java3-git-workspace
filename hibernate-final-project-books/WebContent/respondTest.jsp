<%@page import="com.project.hibernate.ProjectGuiMethods" %>

<html>
<body>
To make it lower case ___ <%=FunUtils.makeItLower("FUN FUN FUN") %>
<br/>
Show ProjectGuiMethods___ <%=ProjectGuiMethods.helloWorld() %>
<br/>
</body>
</html>