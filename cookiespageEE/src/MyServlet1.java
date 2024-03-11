

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/serv1")
public class MyServlet1 extends HttpServlet {
	    

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
		   String uname=request.getParameter("uname");
		   String pass=request.getParameter("pass");
		   
		   
		   out.print("<h1>Welcome to Servlet</h1>");
		   out.print("<h4>User Name :"+uname+"</h4>");
		   out.print("<h4>User password :"+pass+"<h4>");
		   
		   Cookie c=new Cookie("uname", uname);
		   response.addCookie(c);
		  out.print("<a href='Serv2'>click</a>"); 

		}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	 
	 }

}
