<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css"></link>
<title>Test Application</title>
</head>
<body>
<h1>Test Application</h1>
<p>UserList .</p>
<div id="content">
<table align="center" >
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
</div>
</body>
</html>