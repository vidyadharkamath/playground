<html>
<head>
<title>Login</title>
<link rel="stylesheet" type="text/css"
  href="${pageContext.request.contextPath}/css/login.css"
></link>
 

 
</head>
<body>
<br/>
<br/><br/><br/><br/>
<center>
<div align="center">
<form id="login" name="f" action="j_spring_security_check" method="POST">
<table>
  <tr>
    <th colspan="2" align="center"><font size="5">Sign In</font></th>
  </tr>
  <tr>
    <td class="labelcell"><b><label for="j_username">Username:</label></b></td>
  </tr>
  <tr>
    <td class="fieldcell"><input class="text" type="text"
      name="j_username" size="30" maxlength="30"
    ></td>
  </tr>
  <tr>
    <td class="labelcell"><b><label for="j_password">Password:</label></b></td>
    
  </tr>
  <tr>
    <td class="fieldcell"><input class="text" type="password"
      name="j_password" size="30" maxlength="30"
    ></td>
  </tr>
  <tr>
    <td class="labelcell" colspan="2"><b><input type="checkbox"
      name="_spring_security_remember_me"
    /> Remember me</b></td>
  </tr>
  <tr>
    <td colspan="2" align="center"><input class="buttons"
      value="Sign In" type="submit"
    /></td>
  </tr>
</table>
</form>
<br/><br/><br/><br/>
<table>
  <tr>
    <th>New here? It's free and easy.</th>
  </tr>
  <tr>
    <td>
    <form  method="GET" action="${pageContext.request.contextPath}/register.do">
    <input class="buttons" type="submit" value="Create new account"></input></form>
    </td>
  </tr>
</table>
</div>
</center>


</body>
</html>