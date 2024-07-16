<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "madvirus.guestbook.GuestBookManager" %>
<%@ page import = "madvirus.guestbook.GuestBook" %>

<%
	int id = Integer.parseInt(request.getParameter("id"));
    GuestBookManager manager = GuestBookManager.getInstance();
    GuestBook book = manager.getGuestBook(id);
%>
<c:set var="book" value="<%= book %>" />

<c:if test="${!empty book}">
<script language="JavaScript">
	function validate(form) {
	    if (form.password.value == "") {
	        alert("암호를 입력하세요.");
	        return false;
	    }
	}
</script>

<form action="delete.jsp" method="post"
      onSubmit="return validate(this)">
<input type="hidden" name="id" value="${book.id}">
<table width="200" border="1" cellpadding="1" cellspacing="0">

	<tr>
	    <td>작성자</td>
	    <td>${book.name}</td>
	</tr>
	<tr>
	    <td>암호</td>
	    <td><input type="password" name="password" size="10" value=""></td>
	</tr>

	<tr>
	    <td colspan="2">
	    	<center>
		    <input type="submit" value="삭제">
		    <input type="button" value="취소" onClick="javascript:history.go(-1)">
	    	</center>
	    </td>
	</tr>
</table>
</form>
</c:if>

<c:if test="${empty book}">
	글이 존재하지 않습니다.
</c:if>