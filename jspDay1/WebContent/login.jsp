<%@page import="model.regDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String uname=request.getParameter("uname");
String pass=request.getParameter("pass");
regDao db=new regDao();
boolean a=new regDao().checkUser(uname, pass);

if(a)
{
	out.print("Welcome <b>" + uname  +  "<b> <p>you are successfully loged in(:)<p>>");
}
else
{
	out.print("sorry error");
	
}
%>
</body>
</html>