

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/serv1")
public class servfilter1 implements Filter {

    
    public servfilter1() {
    }

		public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

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

		if(uname.equals(""))
				{
			RequestDispatcher dispatcher=request.getRequestDispatcher("index.html");
			out.print("please insert uname");

			dispatcher.include(request, response);
				}
		
		

		
		chain.doFilter(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
