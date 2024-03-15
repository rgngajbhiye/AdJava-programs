package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.UserDao;


@WebServlet("/RegServ")
public class RegServ extends HttpServlet {
       
   


		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			String uname=request.getParameter("uname");
			String upass=request.getParameter("upass");
			String address=request.getParameter("address");
			
			 User u= new User(uname, upass,address);
			 
			 try{
				  int a=new UserDao().save(u);
				  if(a>0){
					  out.print("welcome "+uname+" Data inserted");
				  }
				  else
					{
						out.print("Sorry Error");
					}
			 }catch ( ClassNotFoundException |SQLException e) {
				// TODO: handle exception
				 e.printStackTrace();
			}
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
