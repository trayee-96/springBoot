<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>insert details here</h1>
${msg}
<form:form action="update" method="post" modelAttribute="student">
		<form:label path="id">Id</form:label>
		<form:input path="id" />
		<form:label path="name">Name</form:label>
		<form:input path="name" />
		<form:label path="name">Course</form:label>
		<form:input path="course" />
		<input type="submit" name="submit" value="submit" />
	</form:form>
</body>
</html>