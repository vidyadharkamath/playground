<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<html>
<head>
<title>Hello :: Playground Application</title>
</head>
<body>
<h1>Hello - Playground Application</h1>
<p>UserList .</p>

	<c:forEach items="${users}" var="user">
	<li><c:out value="${user.id}"></c:out></li>
</c:forEach>
</body>
</html>