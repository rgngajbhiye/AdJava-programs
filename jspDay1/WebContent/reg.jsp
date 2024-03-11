<%@page import="model.regDao"%>
<%@page import="model.reg"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  errorPage ="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fname=request.getParameter("fname");
String uname=request.getParameter("uname");
String email=request.getParameter("email");
String pass=request.getParameter("pass");

reg r= new reg(fname,uname,email,pass);

  int u =new regDao().Save(r);
  if(u>0)
  {
	  out.print("<th>Welcome "  +  uname  +  "</th><br><br>");
	  out.print("<h3>welcome page<h3>");
  }
  else
  {
	  out.print("sorry error");
  }

%>
</body>
</html>