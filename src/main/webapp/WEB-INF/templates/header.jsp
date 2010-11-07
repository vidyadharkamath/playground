<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div id="headerTitle"><h1><fmt:message key="site.title"/></h1></div>

<div class="subHeader">
    <sec:authorize ifAllGranted="ROLE_USER">
        <div align="right">Hello  <c:out value="${userName}"></c:out> 
        &nbsp;&nbsp;&nbsp;<a href="<c:url value="/logout.do"/>"><fmt:message key="button.logout"/></a></div>
    </sec:authorize>
</div>
