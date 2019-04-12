<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <c:forEach var="book" items="${requestScope.books}">
        <a href="${pageContext.request.contextPath}/show-book-details?id=${book.id}">${book.title}</a><br>
    </c:forEach>
</div>
</body>
</html>