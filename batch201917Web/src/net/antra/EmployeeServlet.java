package net.antra;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		String empID=req.getParameter("id");
		String name=req.getParameter("name");
		String sal1=req.getParameter("sal");
		
		int id=Integer.parseInt(empID);
		int sal=Integer.parseInt(sal1);
		
	/*	try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","manas");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
		pstmt.setInt(1,id);
		pstmt.setString(2, name);
		pstmt.setInt(3, sal);
		pstmt.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		
		PrintWriter out=res.getWriter();
		out.println(empID);
		out.println(name);
		out.println(sal);
		
		
		
		
	}
}
