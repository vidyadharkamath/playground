<html>
<body >
<form action="register.do" method=post>
<center>
<table cellpadding=2 cellspacing=1 border="1" bgcolor="lightblue">
<th bgcolor="lightblue" colspan=2>
<font size=5>User Registration</font>
<br>
<font size=2 color="red"><sup>*</sup> Required Fields</font>
</th>
<tr bgcolor="lightblue">
<td valign=top> 
<b>First Name<sup>*</sup></b> 
<br>
<input type="text" name="firstName" value="" size=20 maxlength=20></td>
<td valign=top>
<b>Last Name<sup>*</sup></b>
<br>
<input type="text" name="lastName" value="" size=15 maxlength=20></td>
</tr>
<tr bgcolor="lightblue">
<td valign=top>
<b>E-Mail<sup>*</sup></b> 
<br>
<input type="text" name="email" value="" size=25 maxlength=125>
<br></td>
<td valign=top>
<b>Zip Code<sup>*</sup></b> 
<br>
<input type="text" name="zip" value="" size=10 maxlength=8></td>
</tr>
<tr bgcolor="lightblue">
<td valign=top colspan=2>
<b>User Name<sup>*</sup></b>
<br>
<input type="text" name="userName" size=20 value="" maxlength=10>
</td>
</tr>
<tr bgcolor="lightblue">
<td valign=top>
<b>Password<sup>*</sup></b> 
<br>
<input type="password" name="password1" size=10 value="" maxlength=10></td>
<td valign=top>
<b>Confirm Password<sup>*</sup></b>
<br>
<input type="password" name="password2" size=10 value="" maxlength=10></td>
<br>
</tr>
 
 
<tr bgcolor="lightblue">
<td align=center colspan=2>
<input type="submit" value="Submit"> <input type="reset"  value="Reset">
</td>
</tr>
</table>
</center>
</form>
</body>
</html>