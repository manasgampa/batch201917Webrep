package net.antra;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieEx extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) {
		
		
		Cookie ck[]=req.getCookies();
		if(ck!=null) {
		for(int i=0;i<ck.length;i++) {
			System.out.println(ck[i].getName());
			System.out.println(ck[i].getValue());
		}
		}else {
			System.out.println("no cookies");
		}
		
	}
}
