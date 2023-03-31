package com.hari;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/sq")
public class sqServlet extends HttpServlet{
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException{
		int ress=Integer.parseInt(req.getParameter("k"));
		
		PrintWriter out=res.getWriter();
		out.println("hi i am using the second servlet");
		out.println("the result is:"+ress);
	}

}
