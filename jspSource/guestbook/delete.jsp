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
	    alert("delete.jsp ���� �������� �ʽ��ϴ�.");
	    location.href="list.jsp";
    </script>
    </c:when>

    <c:when test="${book.password != param.password}">
    <script>
	    alert("��ȣ�� �ٸ��ϴ�.");
	    history.go(-1);
    </script>
    </c:when>

    <c:when test="${book.password == param.password}">
    <%
        manager.delete(id);
    %>
    <script>
	    alert("���� �����Ͽ����ϴ�.");
	    location.href="list.jsp";
    </script>
    </c:when>
</c:choose>