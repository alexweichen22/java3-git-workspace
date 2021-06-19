<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*, com.jac.jsp.tgdemo.Student" %>
	<%	// Just create some sample data
		List<Student> data = new ArrayList<>();
		data.add(new Student("John","Doe", false));		
		data.add(new Student("Jack","Boe", false));	
		data.add(new Student("Mary","Zoe", true));	
		pageContext.setAttribute("myStudent", data);	
	%>
<html>
<body>
	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Gold Customer</th>
		</tr>
		<c:forEach var="tempStudent" items="${myStudent}">
			<tr> 
				<td>${tempStudent.firstName}</td>
				<td>${tempStudent.lastName}</td>
				<td>
					<c:if test="${tempStudent.goldCustomer}" >
						Special Discount
					</c:if>
					
					<c:if test="${not tempStudent.goldCustomer}" >
						Regular Customer
					</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>