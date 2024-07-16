<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<HTML>

<BODY>
		The movie List :  <br><br>
		<table>
		
		<c:forEach var="movie" items="${movieList}" >
			
			<tr>
				<td> 
					${movie}					
				</td>				
			</tr>
			
		</c:forEach>
		
		</table>
</BODY>

</HTML>

 

