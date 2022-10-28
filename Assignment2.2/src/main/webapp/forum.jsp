<!DOCTYPE html>
<html lang="en">
<%@ page import="classes.servlet.controller.ForumPage" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="UTF-8">
    <title>Forum</title>
</head>
<body>
<table  style="width: 100%;border:1px solid black; border-collapse: collapse;">
    <tr>
        <th>Username </th>
        <th>Message</th>
        <th>Date</th>
        <th>Favorite Sport</th>
    </tr>
    <c:forEach var="entry" items="${entries}">
        <tr>
            <td>${entry.getUsername()}</td>
            <td>${entry.getMessage()}</td>
            <td>${entry.getDate()}</td>
            <c:forEach var="sport" items="${entry.getSport()}">
            <td>${sport}</td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>
<button onclick="window.location.href='http://localhost:8080/forum'">Back</button>

</body>
</html>