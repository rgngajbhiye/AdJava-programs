

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/serv1")
public class testserv1 extends HttpServlet {
	

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			String uname=request.getParameter("uname");
			String lname=request.getParameter("lname");
			String address=request.getParameter("address");
			String email=request.getParameter("email");
			
			String gen=request.getParameter("gender");
			//String btn1=request.getParameter("btn1");
			//String btn2=request.getParameter("btn2");

			String chk=request.getParameter("check");
			//String btn=request.getParameter("yes");

			
			out.print("First Name :"+uname);
			out.print("<br><br>Last Name  :"+lname);
			out.print("<br><br>Address    :"+address);
			out.print("<br><br>Email Address     :"+email);
			out.print("<br><br>Gender     :"+gen);
			
			out.print("<br><br>Are you sure given info is correct  :"+chk);
			
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

}
