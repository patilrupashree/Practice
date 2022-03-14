package com.demo.emp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet("/Controller")
	public class Controller extends HttpServlet {
		private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			String data = request.getParameter("data");

			switch(data) {
			case" 1 ":
				
				RequestDispatcher rd= request.getRequestDispatcher("/create");
				rd.forward(request,response);
				break;
				
	case"2":
				
				RequestDispatcher rd1= request.getRequestDispatcher("/find");
				rd1.forward(request,response);
				break;
				
	case"3":
		RequestDispatcher rd3= request.getRequestDispatcher("/list");
		rd3.forward(request,response);
		break;
				
		 
				
			}
		}
	
}
