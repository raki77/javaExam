/* profeel 2006 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class TestJsp3 extends HttpServlet
{
	protected void doGet( HttpServletRequest request, 
							HttpServletResponse response) 
		throws ServletException, IOException {
		
		String[] movieList = { "Amelie" , "Return of the King" , 
				"Mean Girls" , "King kong"
		};
		
		request.setAttribute("movieList", movieList);
		
		RequestDispatcher view = 
			request.getRequestDispatcher("testJsp3.jsp");

		view.forward(request, response);

	}
			
}
