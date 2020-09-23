<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.err{
		font-size: 9pt;
		color : red;
		font-weight: bold;
	}
	.err1{
		display: none;
	}
</style>

</head>
<body>
	<h1>input.jsp</h1>
	<form:form commandName="b" action="input" method="post">
		책제목 : <input type="text" name="title" value="${b.title }"><br>
		<form:errors cssClass="err" path="title"/><br>
		저자 : <input type="text" name="author" value="${b.author }"><br>
		<form:errors cssClass="err" path="author"/><br>
		가격 : <input type="text" name="price" value="${b.price }"><br>
		<form:errors cssClass="err" path="price"/><br>
		출판사 : <input type="text" name="publisher" value="${b.publisher }"><br>
		<form:errors cssClass="err" path="publisher"/><br>
		<input type="submit" value ="전송">
	</form:form>
</body>
</html>