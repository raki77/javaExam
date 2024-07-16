/* profeel 2006 */

import foo.*;

import foo.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class TestJspPerson extends HttpServlet
{
	protected void doGet( HttpServletRequest request, 
							HttpServletResponse response) 
		throws ServletException, IOException {
		
		// foo.MyPerson p = new foo.Employee();
		foo.Person p = new foo.Person();
		p.setName("foobar");		

		foo.Dog d = new foo.Dog();
		d.setName("Mery~");
		p.setDog(d);

		request.setAttribute("person", p);

		RequestDispatcher view = 
			request.getRequestDispatcher("testDog.jsp");

		view.forward(request, response);

	}
			
}
