<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<sql:query var="rs" dataSource="jdbc/TestDB">
	select id, foo, bar from testdata
</sql:query>

<html>
	
	<head> 
		<title> DB Test </title>
	</head>
	
	<body> 
	
		<h2> Results </h2>
		
		<c:forEach var="row" items="${rs.rows}">
			Foo ${row.foo} <br/>
			Bar ${row.bar} <br/>
		</c:forEach>
		
	</body>
	
</html>


