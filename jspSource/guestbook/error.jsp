	<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "javax.servlet.ServletException" %>
<%@ page isErrorPage = "true" %>
<html>
<head><title>���� �߻�</title></head>
<body>

������ �߻��Ͽ����ϴ�!!<br><br>
���� �޽���: <%= exception.getMessage() %>
<p>
<%
    Throwable rootCause = null;
    if (exception instanceof ServletException) {
        rootCause = ((ServletException)exception).getRootCause();
    } else {
    	rootCause = exception.getCause();
    }
    if (rootCause != null) {
        do {
%>
���� ����: <%= rootCause.getMessage() %><br>
<%
            rootCause = rootCause.getCause();
        } while(rootCause != null);
    }
%>
</body>
</html>