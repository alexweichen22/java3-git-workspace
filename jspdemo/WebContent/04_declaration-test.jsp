<html>
<body>
<h3>Declaration Test</h3>
<%!
String makeItLower(String data){
	return data.toLowerCase();
}
%>

To make it lower case ___ <%=makeItLower("FUN FUN FUN") %>
</body>
</html>