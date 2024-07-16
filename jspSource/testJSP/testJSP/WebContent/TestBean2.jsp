<HTML>

<HEAD>

 <TITLE> JSP Document </TITLE>

</HEAD>

<BODY>
	
	name is : ${param.name} <br>
	empID is: ${param.empID} <br>
	food is : ${param.food} <br>
	
	First food is: ${paramValues.food[0]} <br>
	Second food is : ${paramValues.food[1]} <br>
	
	Host is : ${header.host} <br>
	Host is : ${header["host"]}  <br>
	Method is : ${pageContext.request.method} 

</BODY>

</HTML>


 
