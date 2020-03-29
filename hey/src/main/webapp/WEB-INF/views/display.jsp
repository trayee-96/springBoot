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
<h1>Student Details</h1>
<table border="2">
<tr>
<th>ID</th>
<th>Name</th>
<th>Course</th>
</tr>
<c:forEach items="${list}" var="st">
<tr>
<td>${st.id}</td>
<td>${st.name}</td>
<td>${st.course}</td>
</tr>
</c:forEach>
</table>
</body>
</html>