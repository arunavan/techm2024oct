package com.tm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello123")
public class HelloServlet extends HttpServlet { //Tomcat   //Servlet
	public void init(ServletConfig sc)   throws ServletException{
		//db,file,socket
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("Welcome to Servlet....");
	}
	public void destroy() {
		//db.close()
	}
}

