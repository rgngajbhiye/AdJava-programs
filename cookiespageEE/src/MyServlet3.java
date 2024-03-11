

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Serv3")
public class MyServlet3 extends HttpServlet {
	    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<h1> Welcome to Servlet3 ('-')   </h1>");
		Cookie ck[]=request.getCookies();
		
		if(ck==null)
		{
		response.sendRedirect("index.html");
		}
		else
		{
		out.print("<h4> User Name :"+ck[0].getValue()+"</h4>");	
		}
		
		out.print("<a href='logout'>logout</a>");
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
