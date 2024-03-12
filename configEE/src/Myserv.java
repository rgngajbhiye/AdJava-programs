

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myserv extends HttpServlet {
	   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	   		response.setContentType("text/html");
	   		PrintWriter  out=response.getWriter();
	   		
	   		ServletConfig config=getServletConfig();
	   		String hrname =config.getInitParameter("hrname");
	   		
	   		out.print("<br/>hello admin"+hrname);
	   		out.print("<br/>hello admin"+hrname);
	   		out.print("<br/>hello admin"+hrname);
	   		out.print("<br/>hello admin"+hrname);
	   		out.print("<br/>hello admin"+hrname);

	   		
	   	}
	   		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
