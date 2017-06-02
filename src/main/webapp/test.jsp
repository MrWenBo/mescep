
<%@page import="com.mes.cep.utils.TestInvoke"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<script type="text/javascript">
	function run() {
		TestInvoke testInvoke = new TestInvoke();
		testInvoke.doTest();
	}
</script>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<input type="button" value="执行规则" onclick="window.location.reload()"
		name="button1">
	<%
		TestInvoke testInvoke = new TestInvoke();
		testInvoke.doTest();
	%>

</body>
</html>