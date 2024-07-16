
<HTML>

<HEAD>

 <TITLE> JSP Document </TITLE>

</HEAD>

<BODY>

	<jsp:useBean id="man" type="foo.MyPerson" class="foo.Employee">
		<jsp:setProperty name="man" property="name" param="userName" />
		<jsp:setProperty name="man" property="empID" param="empID" />
	</jsp:useBean>

	name : <jsp:getProperty name="man" property="name" />
	<BR>
	ID   : <jsp:getProperty name="man" property="empID" />
	<BR>

</BODY>

</HTML>


 
