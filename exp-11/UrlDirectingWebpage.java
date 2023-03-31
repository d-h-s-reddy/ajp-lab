package com.urls;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UrlDirectingWebpage  extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String s=req.getParameter("url1");
		PrintWriter out=res.getWriter();
		res.sendRedirect(s);
	}
}
