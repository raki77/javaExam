<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page errorPage = "/error/error_view.jsp" %>

<%@ page import = "madvirus.guestbook.GuestBookManager" %>
<%@ page import = "madvirus.guestbook.GuestBook" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
   	int id = Integer.parseInt(request.getParameter("id"));
    GuestBookManager manager = GuestBookManager.getInstance();
    GuestBook book = manager.getGuestBook(id);
%>

<c:set var="book" value="<%= book %>" />

<c:choose>
    <c:when test="${empty book}">
    <script>
	    alert("delete.jsp 글이 존재하지 않습니다.");
	    location.href="list.jsp";
    </script>
    </c:when>

    <c:when test="${book.password != param.password}">
    <script>
	    alert("암호가 다릅니다.");
	    history.go(-1);
    </script>
    </c:when>

    <c:when test="${book.password == param.password}">
    <%
        manager.delete(id);
    %>
    <script>
	    alert("글을 삭제하였습니다.");
	    location.href="list.jsp";
    </script>
    </c:when>
</c:choose>