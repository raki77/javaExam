<%@ page import="java.util.*" %>

<HTML>

<HEAD>

 <TITLE> JSP Document </TITLE>

</HEAD>

<BODY>
 <h1 align="center"> Beer Recommendation JSP </h1>

<%
	List styles = (List)request.getAttribute("styles");
	Iterator it = styles.iterator();

	while(it.hasNext()) {
		out.print("<br> try: " + it.next());
	}

%>

</BODY>

</HTML>


 
