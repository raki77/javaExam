<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<HTML>

<BODY>		
		<table>
		
		<c:forEach var="listElement" items="${movies}" >
			
			<c:forEach var="movie" items="${listElement}">
				<tr>
					<td> ${movie} </td>
				</tr>			
				
			</c:forEach>
			
		</c:forEach>
		
		</table>
		
		-----------------------------------<br>
		
		<table>
			<c:forEach var="head" items="${header}" >
	
			<tr>
				<td> ${head.key } </td>
				<td> ${head.value } </td>
			</tr>
				
			</c:forEach>
		</table>
</BODY>

</HTML>

 

