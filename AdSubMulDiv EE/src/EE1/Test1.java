package EE1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class Test1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	
	
	int n1=Integer.parseInt(req.getParameter("n1"));
	int n2=Integer.parseInt(req.getParameter("n2"));
	String bn = req.getParameter("btn");
	
	switch (bn) {
	case "Add":
		out.print("Result :"+(n1+n2));

		break;
      case "Substraction":
    		out.print("Result :"+(n1-n2));

		break; 
      case "Multiplication":
    		out.print("Result :"+(n1*n2));

  		break;
      case "division":
    		out.print("Result :"+(n1/n2));

  		break;
	default:
		break;
	}
	
	
	
		
}
}
