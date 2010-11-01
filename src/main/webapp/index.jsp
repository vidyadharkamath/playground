<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insertDefinition name=".mainTemplate" />



<html>
<body>
<h1> index.jsp page</h1>

<a href="${pageContext.request.contextPath}/login.do" > Login Here </a>
<br/>
<a href="${pageContext.request.contextPath}/register.do" > Register Here  </a>
<br/><a href="${pageContext.request.contextPath}/trade/list.do">  List my Trades</a>
</body></html>