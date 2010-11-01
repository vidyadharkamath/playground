<html>
<head>
<title>Login</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"></link>
</head>
<body>
<div id="content" align="center"><h1>User Login Screen</h1>
<form name="f" action="j_spring_security_check" method="POST">
<table>
<tr><td>User:</td><td><input type='text' name='j_username'/></td></tr>
<tr><td>Password:</td><td><input type='password' name='j_password'/></td></tr>
<tr><td colspan="2" align="center"><input type="checkbox" name="_spring_security_remember_me"/> Remember me for two weeks</td></tr>
<tr><td colspan="2" align="center"><input value="Login" type="submit"/></td>  </tr>
</table>
</form></div>
</body>
<h1> Test panel-- the following should not work from here</h1>

<a href="${pageContext.request.contextPath}/login.do" > Login Here </a>
<br/>
<a href="${pageContext.request.contextPath}/register.do" > Register Here  </a>
<br/><a href="${pageContext.request.contextPath}/trade/list.do">  List my Trades</a>

</html>