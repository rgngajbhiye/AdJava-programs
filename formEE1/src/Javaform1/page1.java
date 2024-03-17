package Javaform1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/page1")
public class page1 extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String fp=request.getParameter("fname");
			String lp=request.getParameter("lname");
			String ph=request.getParameter("ph");
			String em=request.getParameter("email");
			
			String gen=request.getParameter("gender");
			String b1=request.getParameter("bt1");
			String b2=request.getParameter("bt2");
			
			
			String dt=request.getParameter("date");
			String cr=request.getParameter("course");
			String bn1=request.getParameter("btn3");
			String bn2=request.getParameter("btn2");

			String bn3=request.getParameter("btn3");

			String cb=request.getParameter("checkbox");
			
			
			out.print("<tr> <b>  First Name  </b> :</tr>"+   fp);
			
		     out.print("<tr><br><br> <b> Last Name </b> :</tr>"+ lp);
		     
		     out.print("<tr><br><br> <b> Phone No </b> :<tr>"+ ph);
		     
		     out.print("<tr><br><br>  <b> Email address </b>:</tr>"+ em);
		     
		     out.print("<tr><br><br> <b>  Gender </b> :</tr>"+ gen);
		     if(gen==b1)
		     {
		    	 out.print("male");
		     }
		     else{
		    	 out.print("female");
		     }
		     out.print("<tr><br><br>  <b> Date of Birth </b>  :</tr>"+ dt);
		     
		     out.print("<tr><br><br> <b> Course </b> :</tr>"+ cr);
		     
		     switch (cr) {
			case "bn1":
				out.print("java");
				break;
                 
			case "bn2":
				out.print("c++");
				break;
				
			case "bn3":
				out.print("c");
				break;
				
			default:
				break;
			}
		      
		     
		     out.print("<tr><br><br> <b> Would you like to sign up </b> :</tr>"+ cb);
		     
		     if(cb.equals(0))
		     {
		    	 out.print("yes");
		     }
		     else{
		    	 out.print("wrong choice");
		     }
		     
	}

}
