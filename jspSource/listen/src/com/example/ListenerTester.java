/* profeel 2006 */

package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ListenerTester extends HttpServlet
{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException {

		
		response.setContentType("text/html");
		
		Dog dog = (Dog) getServletContext().getAttribute("dog");
		request.setAttribute("breed", dog.getBreed());



		RequestDispatcher view = 
			request.getRequestDispatcher(getServletConfig().getInitParameter("url"));

		view.forward(request, response);


		/*
		synchronized(getServletContext()) {

			getServletContext().setAttribute("foo", "22");
			getServletContext().setAttribute("bar", "42");

			out.println(getServletContext().getAttribute("foo"));
			out.println(getServletContext().getAttribute("bar"));

		}*/

		//HttpSession session = request.getSession();

		/*
		synchronized(session) {
			session.setAttribute("foo", "22");
			session.setAttribute("bar", "42");

			out.println(session.getAttribute("foo"));
			out.println(session.getAttribute("bar"));
		}*/

		//if(session.isNew()) {
		//	out.println("This is a new session.");
		//}else {
	//		out.println("Welcome back!");
	//	}


	}

}
