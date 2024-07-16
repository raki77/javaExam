<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<sql:query var="rs" dataSource="jdbc/TestDB">
	select name, genre from movie
</sql:query>

<html>
	
	<head> 
		<title> DB Test </title>
	</head>
	
	<body> 
	
		<h2> Results </h2>
		
		<table border="1">
		
			<td> name </td> <td> Genre </td>			
			<c:forEach var="row" items="${rs.rows}">
				<tr>
					<td> ${row.name }</td>
					<td> ${row.genre }</td>
				</tr>
			</c:forEach>

		</table>		
	</body>
	
</html>

