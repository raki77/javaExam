<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page errorPage = "/error/error_view.jsp" %>
<html>
<head>
<title>�׸� ������</title>
<style>
A { color: blue; font-weight: bold; text-decoration: none}
A:hover { color: blue; font-weight: bold; text-decoration: underline}
</style>
</head>
<body>

<table width="100%" border="1" cellpadding="2" cellspacing="0">
<tr>
    <td>
        <jsp:include page="/module/top.jsp" flush="false" />
    </td>
</tr>
<tr>
    <td>
        <!-- ���� �κ�: ���� -->
        <jsp:include page="${param.CONTENTPAGE}" flush="false" />
        <!-- ���� �κ�: �� -->
    </td>
</tr>
<tr>
    <td>
        <jsp:include page="/module/bottom.jsp" flush="false" />
    </td>
</tr>
</table>
</body>
</html>