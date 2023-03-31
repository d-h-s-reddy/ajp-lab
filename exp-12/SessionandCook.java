package com.seandco;

import java.io.*;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessionandCook extends HttpServlet{
	/**
	 *
	 */
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
        int k=i+j;
		
//		PrintWriter out=res.getWriter();
//		out.println("result mult is:"+k);		
// now we create another page sendredirecting
//		res.sendRedirect("sc?k="+k);
		
//		Session which is used to store the values into that session to access in another servlet generally it was provided by the tomcat so we can req them to send the session
//		HttpSession sess=req.getSession();
//		sess.setAttribute("result",k);
		
		
//		now implementing the cookies
		Cookie cook=new Cookie("result",k + "");
		res.addCookie(cook);
		res.sendRedirect("sc");
		
	}

}
