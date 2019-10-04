package net.antra;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) {
		
		Cookie ck1=new Cookie("uname","manas");
		Cookie ck2=new Cookie("age","35");
		
		res.addCookie(ck1);
		res.addCookie(ck2);
		
		
	}

}
