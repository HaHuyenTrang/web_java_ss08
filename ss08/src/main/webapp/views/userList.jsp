<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Trang
  Date: 5/15/2025
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>User List</title>
  <style>
    table {
      border-collapse: collapse;
      width: 70%;
      margin: 20px auto;
    }
    th, td {
      border: 1px solid #999;
      padding: 8px 12px;
      text-align: left;
    }
    th {
      background-color: #f2f2f2;
    }
  </style>
</head>
<body>
<h2 style="text-align:center;">Danh sách người dùng</h2>
<table>
  <thead>
  <tr>
    <th>Tên</th>
    <th>Tuổi</th>
    <th>Ngày sinh</th>
    <th>Email</th>
    <th>Điện thoại</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="user" items="${users}">
    <tr>
      <td>${user.name}</td>
      <td>${user.age}</td>
      <td>${user.birthday}</td>
      <td>${user.email}</td>
      <td>${user.phone}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
