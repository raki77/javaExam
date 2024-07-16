<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "madvirus.guestbook.GuestBookManager" %>
<%@ page import = "java.sql.Timestamp" %>
<%@ page errorPage = "/error.jsp" %>

<%
    request.setCharacterEncoding("euc-kr");
%>

<jsp:useBean id="book" class="madvirus.guestbook.GuestBook">
    <jsp:setProperty name="book" property="*" />
</jsp:useBean>

<%
    book.setRegister(new Timestamp(System.currentTimeMillis()));
    GuestBookManager manager = GuestBookManager.getInstance();
    manager.insert(book);
%>

<script language="JavaScript">
	alert("방명록에 글을 등록하였습니다.");
	location.href = "list.jsp";
</script>