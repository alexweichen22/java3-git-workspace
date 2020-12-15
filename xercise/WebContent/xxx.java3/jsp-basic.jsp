<%@page import="xxx.java3.TestUtil"%>
<html>
	<body>
		<h1>JSP Exercise</h1>
		
		<p>No library imported as this point</p>
		
		<h3>Show server time</h3>		
		The server time is: <%=new java.util.Date() %>
		<br/>
		
		To display a book: <br/>
		<%=TestUtil.returnBookName("Java The Hard Way") %>
		
	</body>
</html>