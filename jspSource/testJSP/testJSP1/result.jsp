<%@ page import="java.util.*" %>
<HTML>

<HEAD>

 <TITLE> JSP Document </TITLE>

</HEAD>

<BODY>

	The friends who share your hobby of 
	<!--<%= request.getParameter("hobby") %>-->
	${request.hobby}
	
	are : <BR>

	<%	
		ArrayList list = (ArrayList) request.getAttribute("names"); 	
		Iterator it = list.iterator();

		while(it.hasNext()) { 
	%>

			<%= it.next() %> <BR>
		
	<% 
		} 
	%>

	
	<BR>		

</BODY>

</HTML>


 
