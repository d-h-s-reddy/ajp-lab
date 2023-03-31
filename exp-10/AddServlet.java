package com.hari;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class AddServlet extends HttpServlet{
	//we need to write the code inside the service method
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException, ServletException{
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
//		req.setAttribute("K",k);
//		RequestDispatcher di=req.getRequestDispatcher("sq");
//		di.forward(req,res);	
//		PrintWriter out=res.getWriter();
//		out.print("result:"+k);
		
		//request redirecting 
		res.sendRedirect("sq?k="+k);//assigning the parameters to the url is caled as the url rewriting
		
		
	}
	

}
