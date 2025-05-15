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
  <meta charset="UTF-8" />
  <title>Thông tin sản phẩm mới</title>
</head>
<body>
<h2>Thông tin sản phẩm mới đã thêm</h2>
<p><strong>ID:</strong> ${product.id}</p>
<p><strong>Tên:</strong> ${product.name}</p>
<p><strong>Số lượng:</strong> ${product.quantity}</p>
<p><strong>Giá:</strong> ${product.price}</p>

<a href="/products">← Xem danh sách sản phẩm</a>
</body>
</html>
