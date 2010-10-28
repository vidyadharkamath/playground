<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<html>
<head>
<link rel="stylesheet" href="css/style.css"     type="text/css"> 
<title>Test Application</title>
</head>
<body>
<h1>Test Application</h1>
<p>UserList .</p>
<table border=1 >
<tr>
<th> Id</th><th>Name</th><th>Password</th></tr>

	<c:forEach items="${users}" var="user">
	<tr>
	<td><c:out value="${user.id}"></c:out></td>
	<td> <c:out value="${user.name}"></c:out></td>
	<td><c:out value="${user.password}"></c:out></td>
	</tr>
	
</c:forEach>
</table>
</body>
</html>