<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title><fmt:message key="site.title" /></title>
</head>
<body>
<div id="header"><tiles:insertAttribute name="header" /></div>
<div id="body"><tiles:insertAttribute name="body" /></div>
<div id="footer"><tiles:insertAttribute name="footer" /></div>
</body>
</html>
