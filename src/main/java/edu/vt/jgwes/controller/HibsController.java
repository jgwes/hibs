package edu.vt.jgwes.controller;

import java.io.IOException;


import javax.servlet.*;
import javax.servlet.http.*;

import edu.vt.jgwes.dao.AccessManager;

@SuppressWarnings("serial")
public class HibsController extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws IOException, ServletException {

			//String eventText = request.getParameter("eventText");
			String messageText = request.getParameter("messageText");
		
			AccessManager accessManager;
			try {
				accessManager = new AccessManager();
				accessManager.save(messageText);
				accessManager.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			
			/*
			String c = request.getParameter("color");
			BeerExpert be = new BeerExpert();
			List result = be.getBrands(c);

			request.setAttribute("styles", result);

			RequestDispatcher view = request.getRequestDispatcher("result.jsp");
			view.forward(request, response);
			*/
			
			

		}
}