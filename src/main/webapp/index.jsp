<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<html>
<body>
<h1> index.jsp page</h1>

<a href="${pageContext.request.contextPath}/login.do" > Login Here </a>
<br/>
<a href="${pageContext.request.contextPath}/register.do" > Register Here  </a>
<br/><a href="${pageContext.request.contextPath}/trade/list.do">  List my Trades</a>


<h1><spring:message code="greeting" /></h1>

<p><spring:message code="index.message" /></p>
</body></html>