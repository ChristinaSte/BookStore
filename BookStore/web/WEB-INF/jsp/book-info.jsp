<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    Название <span>${requestScope.book.title}</span><br>
    Автор <span>${requestScope.book.author}</span><br>
    Жанр <span>${requestScope.book.genre_name}</span><br>
    Количество страниц <span>${requestScope.book.pages}</span><br>
    Дата издания <span>${requestScope.book.publication_date}</span><br>
    Цена <span>${requestScope.book.price}</span><br>
</div>
</body>
</html>