package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 9,urlPatterns = "/call")
public class TodayServlet extends HttpServlet {
	
	 public TodayServlet() {
			System.out.println("Created" + this.getClass().getSimpleName());
            }
	 
	 
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running dopost...");
		String data="Manu is a Software Devolper";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
		
	}
	 
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   System.out.println("running doget....");
	   String data=" Software Devolper";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");

	}
	 
	 @Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running delete....");
		String data="Devolper";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");

	}
	 @Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running put...");
		String data="Manu Devolper";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");

	}
	 
	 @Override
	protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("running option....");
		

	}
	 
	 @Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("running trace");
	

	}
	 
	 @Override
	protected void doHead(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("running head...");
		
	}
}
	  
	 

		   
	


