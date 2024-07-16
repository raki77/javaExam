/* profeel 2006 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestJsp4 extends HttpServlet
{
	protected void doGet( HttpServletRequest request, 
							HttpServletResponse response) 
		throws ServletException, IOException {
		
		String[] movies1 = { "Matrix Revolutions", "Kill bill" , "Boondock Saints" };
		String[] movies2 = { "Amelie", "Return of King" , "Mean Girls" };
		
		List movieList = new ArrayList();
		
		movieList.add(movies1);
		movieList.add(movies2);
		
		request.setAttribute("movies" , movieList);
		
		RequestDispatcher view = 
			request.getRequestDispatcher("testJsp4.jsp");

		view.forward(request, response);

	}
			
}
