<%@ page import="foo.*" %>
<HTML>

<HEAD>

 <TITLE> JSP Document </TITLE>

</HEAD>

<BODY>
	id : request�� ������ �Ӽ� , scope="request" ��ſ� application
	<BR>

	<jsp:useBean id="person" type="foo.MyPerson" class="foo.Employee" scope="request" />
		
	Person is: <jsp:getProperty name="person" property="name"  />
	<BR>

		
	
</BODY>

</HTML>

 