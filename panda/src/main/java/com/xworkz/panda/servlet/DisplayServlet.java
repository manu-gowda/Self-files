package com.xworkz.panda.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=1,urlPatterns ="/manu")
public class DisplayServlet extends HttpServlet {

	public DisplayServlet() {
		System.out.println("created:"+ this.getClass().getSimpleName());
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running dopost displayservlet...");
	
	
    String fname=req.getParameter("fname");
    String lname=req.getParameter("lname");
    String gen=req.getParameter("gender");
    String reason=req.getParameter("reason");
    String Address=req.getParameter("address");
    
    
    System.out.println("fname"+fname);
    System.out.println("lname"+lname);
    System.out.println("gender"+gen);
    System.out.println("reason"+reason);
    System.out.println("address"+Address);
    
    
    RequestDispatcher dispatcher=req.getRequestDispatcher("Display.jsp");
    
    
    
    req.setAttribute("fname", fname);
    req.setAttribute("lname", lname);
    req.setAttribute("gen", gen);
    req.setAttribute("reason", reason);
    req.setAttribute("address", Address);
    
    dispatcher.forward(req, resp);
    
    
   	}
	
	

}
