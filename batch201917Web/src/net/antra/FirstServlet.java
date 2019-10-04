package net.antra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet{
	
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
	
		System.out.println("in first servlet");
		/*HttpSession hsession=req.getSession();
		
		
		
		System.out.println("in first servlet");
		PrintWriter out=res.getWriter();
		out.println("welcome to servlet");
		out.println(hsession.getAttribute("uname"));*/
	}

}
