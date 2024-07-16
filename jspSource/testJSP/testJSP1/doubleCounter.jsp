<%@ page import="foo.*, java.util.*" %>

<HTML>

<HEAD>

	<TITLE> JSP Document </TITLE>

</HEAD>

<BODY>

<%! 

	int doubleCount() {

		/*
		if(count >= Integer.MAX_VALUE / 2) {
			count = 1;
		}else {
			count = count * 2;
		}*/
		
		count = count * 2 ;
		if(count == 0) 
			count = 1;

		return count;
	}

%>

<%! int count =1; %>

The page count is now: 

<%= doubleCount() %>

<br>

Test Scriptlets...
<% 
	ArrayList list = new ArrayList(); 
	list.add(new String("foo"));
%>
<%= list.get(0) %>

<br>

<%! int x = 42; %>
<% int x = 22; %>

<%= this.x %>

</BODY>

</HTML>


 
