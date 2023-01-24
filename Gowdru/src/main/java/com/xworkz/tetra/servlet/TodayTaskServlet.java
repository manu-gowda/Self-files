package com.xworkz.tetra.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 8,urlPatterns = "/belike")


public class TodayTaskServlet extends HttpServlet {
	 
   public TodayTaskServlet() {
		System.out.println("Created" + this.getClass().getSimpleName());

   }
   
   @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("call method doget...");
	}
   
   @Override
	public void init(ServletConfig config) throws ServletException {
		
	   System.out.println("running init.....");
	}
   
   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running post....");
		String data="Curd rice, !! car race!!,";
		PrintWriter writer= resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plan");
		
	}
   @Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println();
	}
   do
  }
