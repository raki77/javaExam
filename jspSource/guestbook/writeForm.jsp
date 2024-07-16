<%@ page contentType = "text/html; charset=euc-kr" %>
<html>
<head><title>글쓰기</title></head>
<body>

<script language="JavaScript">
	function validate(form) {
		if (form.name.value == "") {
	        alert("이름을 입력하세요.");
	        return false;
	    }

	    if (form.password.value == "") {
	        alert("암호를 입력하세요.");
	        return false;
	    }

	    if (form.email.value == "") {
	        alert("이메일을 입력하세요.");
	        return false;
	    }

	    if (form.content.value == "") {
	        alert("내용을 입력하세요.");
	        return false;
	    }
	}
</script>

<center>
	<form action="write.jsp" method="post"
			onSubmit="return validate(this)">

		<table width="600" border="1" cellpadding="0" cellspacing="0">
		<tr>
		    <td>이름</td>
		    <td><input type="text" name="name" size="10"></td>
		</tr>
		<tr>
		    <td>암호</td>
		    <td><input type="password" name="password" size="10"></td>
		</tr>
		<tr>
		    <td>이메일</td>
		    <td><input type="text" name="email" size="30"></td>
		</tr>
		<tr>
		    <td>내용</td>
		    <td><textarea name="content" rows="10" cols="60"></textarea></td>
		</tr>
		<tr>
		    <td colspan="2"><center> <input type="submit" value="글남기기"> </center></td>
		</tr>

		</table>
	</form>

</center>

</body>
</html>