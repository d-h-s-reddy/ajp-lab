package com.seandco;

import java.io.*;

//import org.apache.tomcat.util.http.parser.Cookie;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
public class scservlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
//		This is the process of retriveing the data by using the session management
//		HttpSession ses=req.getSession();
//		int resu=(int) ses.getAttribute("result");
		
//		This is the process of fetching the data from the cookies
        Cookie[] cook=req.getCookies();
        int resu=0;
        for(Cookie c:cook) {
        	if(c.getName().equals("result")) {
        		resu=Integer.parseInt(c.getValue());
        	}
        }
		PrintWriter out=res.getWriter();
		out.println("result is:"+resu);
		
//		for removing the session object we can use the obj.removeAttribute("key");
	}
	
}
