<%@ page contentType = "text/html; charset=euc-kr" %>
<html>
<head><title>�۾���</title></head>
<body>

<script language="JavaScript">
	function validate(form) {
		if (form.name.value == "") {
	        alert("�̸��� �Է��ϼ���.");
	        return false;
	    }

	    if (form.password.value == "") {
	        alert("��ȣ�� �Է��ϼ���.");
	        return false;
	    }

	    if (form.email.value == "") {
	        alert("�̸����� �Է��ϼ���.");
	        return false;
	    }

	    if (form.content.value == "") {
	        alert("������ �Է��ϼ���.");
	        return false;
	    }
	}
</script>

<center>
	<form action="write.jsp" method="post"
			onSubmit="return validate(this)">

		<table width="600" border="1" cellpadding="0" cellspacing="0">
		<tr>
		    <td>�̸�</td>
		    <td><input type="text" name="name" size="10"></td>
		</tr>
		<tr>
		    <td>��ȣ</td>
		    <td><input type="password" name="password" size="10"></td>
		</tr>
		<tr>
		    <td>�̸���</td>
		    <td><input type="text" name="email" size="30"></td>
		</tr>
		<tr>
		    <td>����</td>
		    <td><textarea name="content" rows="10" cols="60"></textarea></td>
		</tr>
		<tr>
		    <td colspan="2"><center> <input type="submit" value="�۳����"> </center></td>
		</tr>

		</table>
	</form>

</center>

</body>
</html>