<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<HTML>

<BODY>
		<h2>
			<c:choose>
				<c:when test="${userPref == 'performance'}">
					You selected Performance. <br>
				</c:when>
			
				<c:when test="${param.userPref == 'safety'}">
					You selected safety. <br>
				</c:when>
			
				<c:when test="${param.userPref == 'maintenance'}">
					You selected maintenance. <br>
				</c:when>
				
				<c:otherwise>
					Our brackes are the best. <br>
				</c:otherwise>
			</c:choose>
		</h2>		
		
</BODY>

</HTML>

 

