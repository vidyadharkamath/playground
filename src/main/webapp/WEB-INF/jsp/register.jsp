<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/register.css"></link>
</head>
<body>
If you already have an account, you can  <a href="${pageContext.request.contextPath}/login.do">sign in here</a> 
<h1> Create an Account</h1>
<div>
<form name="signup" id="signup" action="register.do" method="post">
<table>
   
  <tr>
    <td class="labelcell"><b><label for="firstName">First Name<sup>*</sup></label></b></td>
    <td class="fieldcell">
    <input  type="text" name="firstName" value="" size="30"   maxlength="30" 
    ></td>
  </tr>
  <tr>
    <td class="labelcell"><b><label for="lastName">Last Name<sup>*</sup></label></b></td>
    <td class="fieldcell"><input type="text" name="lastName" value="" size="30"   maxlength="30" 
    ></td>
  </tr>
  <tr>
    <td class="labelcell"><b><label for="email">E-Mail<sup>*</sup></label></b></td>
    <td class="fieldcell">
    <input  type="text" name="email" value="" size="30"   maxlength="30"   >
    </td>
  </tr>
  <tr>
    <td class="labelcell"><b><label for="zip">Zipcode<sup>*</sup></label></b></td>
    <td class="fieldcell"><input class="text" type="text" name="zip" value="" size="30"   maxlength="30" 
    ></td> 
  </tr>
  <tr>
    <td class="labelcell"><b><label for="userName">User Name<sup>*</sup></label></b></td>
    <td class="fieldcell">
    <input type="text" name="userName" size="30"   maxlength="30" 
      
    ></td>
  </tr>
  <tr>
    <td  class="labelcell"><b><label for="password1">Password<sup>*</sup></label></b> 
    </td>
    <td class="fieldcell"><input  type="password" name="password1" size="30"   maxlength="30"  >
    </td> 
  </tr>
  <tr>
    <td class="labelcell"><b><label for="password2">Confirm Password<sup>*</sup></label></b> </td>
    <td class="fieldcell"><input  type="password" name="password2" size="30"   maxlength="30"   ></td>
     
  </tr>
  <tr> 
    <td align="center" colspan="2"><input  class="buttons" type="submit"
      value="Register Me"
    ></td>
  </tr>
</table>
</form>
</div>
</body>
</html>