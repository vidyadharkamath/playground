<html>
<head>
<title>Login</title>
</head>
<body>
<h1>User Login Screen</h1>
<form name="f" action="j_spring_security_check" method="POST">
<table>
<tr><td>User:</td><td><input type='text' name='j_username'/></td></tr>
<tr><td>Password:</td><td><input type='password' name='j_password'/></td></tr>
<tr><td><input type="checkbox" name="_spring_security_remember_me"/></td><td>Don't ask for my password for two weeks</td></tr>
<tr><td colspan='2'><input name="submit" type="submit"/></td></tr>
<tr><td colspan='2'><input name="reset" type="reset"/></td></tr>
</table>
</form>
</body>
<h1> Test panel-- the following should not work from here</h1>

<a href="${pageContext.request.contextPath}/login.do" > Login Here </a>
<br/>
<a href="${pageContext.request.contextPath}/register.do" > Register Here  </a>
<br/><a href="${pageContext.request.contextPath}/trade/list.do">  List my Trades</a>

</html>