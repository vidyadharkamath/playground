<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<link rel="stylesheet" href="css/style.css" type="text/css">
<title>Test Application</title>
</head>
<body>
<h1>Test Application</h1>
<p>tradeList </p>
<table border=1>
	<tr>
		<th>Date</th>
		<th>Ticker</th>
		<th>Type</th>
		<th>Unit Price</th>
		<th>Quantity</th> 
		<th>Commission</th>
	</tr>

	<c:forEach items="${trades}" var="trade">
		<tr>
			<td><c:out value="${trade.date}"></c:out></td>
			<td><c:out value="${trade.ticker}"></c:out></td>
			<td><c:out value="${trade.type}"></c:out></td>
			<td><c:out value="${trade.unitPrice}"></c:out></td>
			<td><c:out value="${trade.quantity}"></c:out></td>
			<td><c:out value="${trade.commission}"></c:out></td>
		</tr>
	</c:forEach>
</table> 

<br>

<form:form  method="POST" action="addTrade.do" commandName="addTrade" >
			Date: <form:input path="date" />
			Ticker: <form:input path="ticker" />
			<form:select path="type" items="${tradeTypes}"/>
			Unit Price: <form:input path="unitPrice" />
			Quantity: <form:input path="quantity" />
			Commission: <form:input path="commission" />
			<input type="submit" title="Add Trade" />
		</form:form>

</body>
</html>