 <html>
<body>

<%
out.println("<h1>"+ "HELLO WORLD" + "</h1>");
%>

<%!
String makeHtml(String data){
	return "<h1>" + data + "</h1>";
}
%>

<%=makeHtml("hello world h1 size")%>
<%
out.println("<h1>"+"okkkkk"+"</h2>");
%>
<button>Enter</button>
</body>
</html>