<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>

<body>




<form action="FilesUpload" method="post" enctype="multipart/form-data">

<br>
<input type="file" name="file" multiple/>
<input type="submit" value="Sumbit">

</form>




<form action="login" method="post">

Enter your username :<br>
<input type="text" name="username"><br>

Enter your password :<br>
<input type="password" name="password"><br>

<input type="submit" value="Login">

</form>



</body>
</html>