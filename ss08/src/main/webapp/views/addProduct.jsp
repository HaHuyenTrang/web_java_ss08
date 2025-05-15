<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Trang
  Date: 5/15/2025
  Time: 10:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Thêm sản phẩm</title>
</head>
<body>
<h2>Thêm sản phẩm mới</h2>

<form:form  method="POST" action="/products/add" modelAttribute="product">
  Tên sản phẩm: <form:input path="name" /><br><br>
  Số lượng: <form:input path="quantity" /><br><br>
  Giá: <form:input path="price" /><br><br>
  <input type="submit" value="Thêm mới" />
</form:form>

<a href="/products">← Quay lại danh sách</a>
</body>
</html>
