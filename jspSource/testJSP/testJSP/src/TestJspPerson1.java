/* profeel 2006 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class TestJspPerson1 extends HttpServlet
{
	protected void doGet( HttpServletRequest request, 
							HttpServletResponse response) 
		throws ServletException, IOException {
		
		// foo.MyPerson p = new foo.Employee();
		String[] favoriteMusic = { "Zero 67" , "Tahiti 67" , 
									"BT" , "Frou Frou" };
		request.setAttribute("musicList" , favoriteMusic);

		ArrayList favoriteFood = new ArrayList();
		favoriteFood.add("chai ice chream");
		favoriteFood.add("Kimchi");
		favoriteFood.add("chocolate");
		request.setAttribute("favoriteFood" , favoriteFood);

		Map musicMap = new HashMap();
		musicMap.put("Ambient", "Zero 7");
		musicMap.put("Surf", "Tahiti 60");
		musicMap.put("DJ", "BT");
		request.setAttribute("musicMap" , musicMap);
		
		RequestDispatcher view = 
			request.getRequestDispatcher("testJsp1.jsp");

		view.forward(request, response);

	}
			
}
