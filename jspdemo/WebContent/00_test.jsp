<html>
<body>

<%=new java.util.Date() %>




<%!
String makeHtml(String data){
	return "<h1>" + data + "</h1>";
}
%>

<%=makeHtml("hello world h1 size")%>
<%
out.println("<h1>"+"okkkkk"+"</h2>");
%>

</body>
</html>