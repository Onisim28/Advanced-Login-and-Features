<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="design.css">

</head>
<body bgcolor="cyan">

<!--  <h1>Hello</h1> -->


<% 


response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");


if(session.getAttribute("username")==null){
	
	response.sendRedirect("login.jsp");
	
}

	%>
	
 <h1> <%="Hello, this is my website!" %> </h1> <br>




<a href="video.jsp" target="_blank"> <h3>Video</h3></a>




<form action="logout.jsp"><br>

<input type="submit" value="Logout">

</form>



</body>
</html>


