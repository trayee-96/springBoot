<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Find Student By name</h1>
${msg}
<form action="findName" method="post" >
		Name : <input type = "text" id = "name" name ="name" value = "${name}"/>
	<input type ="reset">
		<input type="submit" name="submit" value="Find" />
		</form>
</body>
</html>