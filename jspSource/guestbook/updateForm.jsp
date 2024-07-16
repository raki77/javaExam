<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "madvirus.guestbook.GuestBookManager" %>
<%@ page import = "madvirus.guestbook.GuestBook" %>
<%@ page errorPage = "/error.jsp" %>

<% 
    int id = Integer.parseInt(request.getParameter("id"));
    GuestBookManager manager = GuestBookManager.getInstance();
    GuestBook book = manager.getGuestBook(id);
%>

<html>
<head><title>�ۼ���</title></head>

<body>

<center>
<form action="update.jsp" method="post">
<input type="hidden" name="id" value="<%= id %>">
<table width="100%" border="1" cellpadding="0" cellspacing="0">
<tr>
    <td>��ȣ</td>
    <td><input type="password" name="password" size="10"><br>
    ���� ���� �Է��� ��ȣ�� �����ؾ� ���� �����˴ϴ�.</td>
</tr>
<tr>
    <td>�̸�</td>
    <td><input type="text" name="name"
               value="<%= book.getName() %>" size="10"></td>
</tr>
<tr>
    <td>�̸���</td>
    <td><input type="text" name="email"
               value="<%= book.getEmail() %>" size="30"></td>
</tr>
<tr>
    <td>����</td>
    <td>
    <textarea name="content" rows="5"
       cols="50"><%= book.getContent() %></textarea>
    </td>
</tr>
<tr>
    <td colspan="2"><input type="submit" value="�ۼ����ϱ�"></td>
</tr>

</table>
</form>

</center>

</body>
</html>