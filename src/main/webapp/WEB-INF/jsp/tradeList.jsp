<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<script type="text/javascript"
  src="http://localhost/2.8.2r1/build/utilities/utilities.js"
></script>
<script type="text/javascript"
  src="http://localhost/2.8.2r1/build/calendar/calendar-min.js"
></script>
<script type="text/javascript"
  src="${pageContext.request.contextPath}/scripts/calendar.js"
></script>
<link rel="stylesheet" type="text/css"
  href="${pageContext.request.contextPath}/css/style.css"
></link>
<script src="${pageContext.request.contextPath}/scripts/sorttable.js"></script>

<!-- Sam Skin CSS for TabView -->
<link rel="stylesheet" type="text/css"
  href="http://localhost/2.8.2r1/build/tabview/assets/skins/sam/tabview.css"
>
<!-- JavaScript Dependencies for Tabview: -->
<script
  src="http://localhost/2.8.2r1/build/yahoo-dom-event/yahoo-dom-event.js"
></script>
<script
  src="http://localhost/2.8.2r1/build/element/element-min.js"
></script>
<!-- Source file for TabView -->
<script
  src="http://localhost/2.8.2r1/build/tabview/tabview-min.js"
></script>
<script type="text/javascript">
var myTabs = new YAHOO.widget.TabView("demo");
</script>
</head>
<body class="yui-skin-sam">
<div id="demo" class="yui-navset">
<ul class="yui-nav">
  <li class="selected"><a href="#tab1"><em>Transactions</em></a></li>
  <li><a href="#tab2"><em>Performance</em></a></li>
  <li><a href="#tab3"><em>Reports</em></a></li>
   <li><a href="#tab3"><em>Settings</em></a></li>
</ul>
<div class="yui-content">
<div id="tab1"><c:if test="${fn:length(trades)>0}">
  <table class="sortable" width="100%">
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
          id="id" name="id" type="hidden" value="${trade.id}"
        /> <a href="javascript:{}"
          onclick="document.getElementById('${trade.id}').submit(); return false;"
        >Delete</a></form>
        </td>
      </tr>
    </c:forEach>
  </table>
</c:if><br>
</div>
</div>
</div>
<div id="cal1Container"></div>
<div>
<table width="100%">
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
      <td><input type="submit" value="Add Trade"></td>
    </form:form>
  </tr>
</table>
</div>
</body>
</html>