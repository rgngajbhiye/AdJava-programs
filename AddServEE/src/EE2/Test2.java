package EE2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   resp.setContentType("text/html");
	   PrintWriter out=resp.getWriter();
	   
	   int num1=Integer.parseInt(req.getParameter("num1"));
	   int num2=Integer.parseInt(req.getParameter("num2"));
	   
	   out.print("Result :"+(num1+num2));
	}

	
}
