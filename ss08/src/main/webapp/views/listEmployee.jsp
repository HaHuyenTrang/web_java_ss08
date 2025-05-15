<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Trang
  Date: 5/15/2025
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Danh sách nhân viên</title></head>
<body>
<h2>Danh sách nhân viên</h2>

<c:if test="${not empty message}">
    <p style="color: green;">${message}</p>
</c:if>

<a href="/employees/add">Thêm nhân viên mới</a><br><br>

<table border="1" cellpadding="5" cellspacing="0">
    <tr>
        <th>Tên</th>
        <th>Email</th>
        <th>Vị trí</th>
    </tr>
    <c:forEach var="emp" items="${employees}">
        <tr>
            <td>${emp.name}</td>
            <td>${emp.email}</td>
            <td>${emp.position}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
