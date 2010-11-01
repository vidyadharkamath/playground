<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insertDefinition name=".mainTemplate" />
<html>
<head>
<script type="text/javascript"
	src="http://yui.yahooapis.com/2.6.0/build/utilities/utilities.js"></script>
<script type="text/javascript"
	src="http://yui.yahooapis.com/2.6.0/build/calendar/calendar-min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/calendar.js"></script>


<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"></link>
</head>

<body class="yui-skin-sam" align="center">
<h1><p>Playground-Transaction Records</p></h1>

<div id="content">
<c:if test="${fn:length(trades)>0}">
<table align="center">
	<tr>
		<th>Date</th>
		<th>Ticker</th>
		<th>Type</th>
		<th>Unit Price</th>
		<th>Quantity</th>
		<th>Commission</th>
		<th>&nbsp;</th>
	</tr>

	<c:forEach items="${trades}" var="trade">
		<tr>
			<td><c:out value="${trade.date}"></c:out></td>
			<td><c:out value="${trade.ticker}"></c:out></td>
			<td><c:out value="${trade.type}"></c:out></td>
			<td><c:out value="${trade.unitPrice}"></c:out></td>
			<td><c:out value="${trade.quantity}"></c:out></td>
			<td><c:out value="${trade.commission}"></c:out></td>
			<td>
			<form id="${trade.id}" method="POST" action="delete.do"><input
				id="id" name="id" type="hidden" value="${trade.id}" /> <a
				href="javascript:{}"
				onclick="document.getElementById('${trade.id}').submit(); return false;">Delete</a>
			</form>
			</td>
		</tr>
	</c:forEach>
</table>
</c:if>
</div>
<br>
<div>
<table>

	<tr>
		<th>Date</th>
		<th>Ticker</th>
		<th>Type</th>
		<th>Unit Price</th>
		<th>Quantity</th>
		<th>Commission</th>
	</tr>
	<tr>
		<form:form method="POST" action="add.do" commandName="trade">

			<td><form:input path="date" id="date" /></td>
			<td><form:input path="ticker" /></td>
			<td><form:select path="type" items="${tradeTypes}" /></td>
			<td><form:input path="unitPrice" /></td>
			<td><form:input path="quantity" /></td>
			<td><form:input path="commission" /></td>
			<td><input type="submit" value="Add Trade" /></td>
		</form:form>
	</tr>

</table>
</div>
<div id="cal1Container"></div>
</body>
</html>