/* profeel 2006 */

import foo.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class TestJspPerson2 extends HttpServlet
{
	protected void doGet( HttpServletRequest request, 
							HttpServletResponse response) 
		throws ServletException, IOException {
		
		foo.Person p = new foo.Person();
		p.setName("Leelu");

		foo.Dog d = new foo.Dog();
		d.setName("Clyde");

		foo.Toy t1 = new foo.Toy();
		t1.setName("stick");

		foo.Toy t2 = new foo.Toy();
		t2.setName("neighbor's cat");

		foo.Toy t3 = new foo.Toy();
		t3.setName("Barbie doll head");

		d.setToys( new foo.Toy[] {t1, t2, t3} );
		p.setDog(d);
		
		request.setAttribute("foo.person" , p);
		
		RequestDispatcher view = 
			request.getRequestDispatcher("testJsp2.jsp");

		view.forward(request, response);

	}
			
}
