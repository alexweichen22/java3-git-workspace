<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = 'c' %>

<html>
<body>

<c:set var="stuff" value="<%=new java.util.Date() %>"/>

Time on server is: 
${stuff}
<br>

Locale on server is: 
${pageContext.request.locale}
<br/>

</body>
</html>