<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<c:catch var="myerror">

	<sql:update var="cnt" dataSource="jdbc/TestDB">
		insert into movie values(null, ?, ?)
		<sql:param value="${param.name}"/>
		<sql:param value="${param.genre}"/>
	</sql:update>
	
</c:catch>

<html>
	
	<head> 
		<title> Movie Registration result </title>
	</head>
	
	<body> 
	
		<h2> movie registered... </h2>
		<p>
		
		<hr>
		Movie list...
		
		<c:if test="${cnt} == 1">
			<jsp:redirect url="insert.html"/>
		</c:if>
				
		<c:if test="${cnt} != 1">
			insert failed
		</c:if>

	</body>
	
</html>



