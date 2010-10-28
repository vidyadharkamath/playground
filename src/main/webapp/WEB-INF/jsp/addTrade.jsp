<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
	<title>Add Trade</title>
</head>
<body>
<center>
		<form:form  method="POST" action="addTrade.do" commandName="addTrade" >
			Date: <form:input path="date" />
			Ticker: <form:input path="ticker" />
			Type: <form:input path="type" />
			Unit Price: <form:input path="unitPrice" />
			Quantity: <form:input path="quantity" />
			<input type="submit" title="Add Trade" />
		</form:form>

</center>
</body>
</html>