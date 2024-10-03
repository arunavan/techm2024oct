package com.tm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		PrintWriter out=response.getWriter();
		response.setContentType("text");
		out.println("Details are:"+ id+"    "+pwd);

		
		
		
		
	}

}
